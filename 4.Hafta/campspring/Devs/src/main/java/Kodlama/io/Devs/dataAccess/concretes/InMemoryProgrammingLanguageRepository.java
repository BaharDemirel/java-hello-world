package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository 
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
	
	List<ProgrammingLanguage> languages;	

	public InMemoryProgrammingLanguageRepository() {
		
		languages = new ArrayList<ProgrammingLanguage>();
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languages;
	}
	
	public ProgrammingLanguage getById(int id) throws Exception{
		for(ProgrammingLanguage programmingLanguage : languages) {
			if(programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		
		throw new Exception("Bulunamadı..");
	}
	
	@Override
	public void add(ProgrammingLanguage language) throws Exception {
		if(language.getName().isEmpty() || language.getName().isBlank()) {
			throw new Exception("Boş geçilemez..");
			
		}
		
		for(ProgrammingLanguage programmingLanguage : languages) {
			if(language.getName().equalsIgnoreCase(programmingLanguage.getName())) {
				throw new Exception("Zaten kayıtlı..");
			}
		}
		
		languages.add(language);		
		
	}
	
	@Override
	public void update(int id, ProgrammingLanguage language) throws Exception {
		if(language.getName().isEmpty() || language.getName().isBlank()) {
			throw new Exception("Boş geçilemez..");
		}
		
		for(ProgrammingLanguage programmingLanguage : languages) {
			if(programmingLanguage.getId() != id && programmingLanguage.getName() == language.getName()) {
				throw new Exception("Zaten kayıtlı..");
			}
		}
		
		for(ProgrammingLanguage programmingLanguage : languages) {
			if(programmingLanguage.getId() == id) {
				programmingLanguage.setName(language.getName());
			}
		}		
	}
	
	@Override
	public void delete(int id) {
		languages.removeIf(language->language.getId() == id);
	}
}
