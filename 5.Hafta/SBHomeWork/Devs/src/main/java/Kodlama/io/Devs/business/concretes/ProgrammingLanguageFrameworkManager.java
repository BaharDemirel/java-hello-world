package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageFrameworkService;
import Kodlama.io.Devs.business.requests.CreateLanguageFrameworkRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageFrameworkRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesFrameworkResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageFrameworkRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguageFramework;

@Service 
public class ProgrammingLanguageFrameworkManager implements ProgrammingLanguageFrameworkService{
	
	private ProgrammingLanguageFrameworkRepository languageFrameworkRepository;
	
	@Autowired
	public ProgrammingLanguageFrameworkManager(ProgrammingLanguageFrameworkRepository languageFrameworkRepository) {
		
		this.languageFrameworkRepository = languageFrameworkRepository;
	}
	
	@Override
	public List<GetAllLanguagesFrameworkResponse> getAll() {
		
		List<ProgrammingLanguageFramework> languageFrameworks = this.languageFrameworkRepository.findAll();
		List<GetAllLanguagesFrameworkResponse> languagesFrameworkResponse = new ArrayList<GetAllLanguagesFrameworkResponse>();
				
		for(ProgrammingLanguageFramework languageFramework : languageFrameworks) {
			GetAllLanguagesFrameworkResponse responseItem = new GetAllLanguagesFrameworkResponse();
			responseItem.setId(languageFramework.getId());
			responseItem.setLanguageId(languageFramework.getLanguageId());
			responseItem.setName(languageFramework.getName());
			languagesFrameworkResponse.add(responseItem);
		}
		return languagesFrameworkResponse;
	}

	@Override
	public void add(CreateLanguageFrameworkRequest createLanguageFrameworkRequest) {
		
		ProgrammingLanguageFramework languageFramework = new ProgrammingLanguageFramework();
		languageFramework.setName(createLanguageFrameworkRequest.getName());
		
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setId(createLanguageFrameworkRequest.getLanguageId());
		languageFramework.setLanguageId(language.getId());

		this.languageFrameworkRepository.save(languageFramework);
	}
	
	@Override
	public void update(int id, UpdateLanguageFrameworkRequest updateLanguageFrameworkRequest)
	{
		ProgrammingLanguageFramework languageFramework = new ProgrammingLanguageFramework();
		
		languageFramework.setName(updateLanguageFrameworkRequest.getName());
		
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setId(updateLanguageFrameworkRequest.getLanguageId());
		languageFramework.setLanguageId(language.getId());
		
		languageFramework.setId(id);
		
		this.languageFrameworkRepository.save(languageFramework);
	}
	
	@Override
	public void delete(int id) {
		ProgrammingLanguageFramework languageFramework = new ProgrammingLanguageFramework();
	
		languageFramework.setId(id);
		
		this.languageFrameworkRepository.delete(languageFramework);
	}
}
