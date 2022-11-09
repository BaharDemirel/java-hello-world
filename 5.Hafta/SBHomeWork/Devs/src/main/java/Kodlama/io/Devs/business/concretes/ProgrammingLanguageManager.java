package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service 
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	
	private ProgrammingLanguageRepository languageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		
		List<ProgrammingLanguage> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();
				
		for(ProgrammingLanguage language : languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			responseItem.setFrameworks(language.getFrameworks());
			languagesResponse.add(responseItem);
		}
		return languagesResponse;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setName(createLanguageRequest.getName());
		
		this.languageRepository.save(language);
		
	}
	
	@Override
	public void update(int id, UpdateLanguageRequest updateLanguageRequest)
	{
		ProgrammingLanguage language = new ProgrammingLanguage();
		
		language.setName(updateLanguageRequest.getName());
		language.setId(id);
		
		this.languageRepository.save(language);
	}
	
	@Override
	public void delete(int id) {
		ProgrammingLanguage language = new ProgrammingLanguage();
	
		language.setId(id);
		
		this.languageRepository.delete(language);
	}

}
