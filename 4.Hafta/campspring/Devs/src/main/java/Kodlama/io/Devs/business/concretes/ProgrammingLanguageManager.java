package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service 
public class ProgrammingLanguageManager implements ProgrammingLanguageRepository{
	
	private ProgrammingLanguageRepository languageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
				
		return languageRepository.getAll();
	}
	
	@Override
	public ProgrammingLanguage getById(int id) throws Exception{
		return languageRepository.getById(id);
	}
	
	@Override
	public void add(ProgrammingLanguage language) throws Exception{
		languageRepository.add(language);
	}
	
	@Override
	public void delete(int id){
		languageRepository.delete(id);
	}
	
	@Override
	public void update(int id, ProgrammingLanguage language) throws Exception{
		languageRepository.update(id, language);
	}

}
