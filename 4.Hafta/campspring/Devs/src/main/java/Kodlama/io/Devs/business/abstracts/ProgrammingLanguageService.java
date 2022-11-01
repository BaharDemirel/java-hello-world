package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	List<ProgrammingLanguage> getAll();
	
	public ProgrammingLanguage getById(int id);
	
	public void add(ProgrammingLanguage language) throws Exception;
	
	public void delete(int id);
	
	public void update(int id, ProgrammingLanguage languge) throws Exception;
	

}
