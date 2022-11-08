package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreateLanguageFrameworkRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageFrameworkRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesFrameworkResponse;

public interface ProgrammingLanguageFrameworkService {
	
	List<GetAllLanguagesFrameworkResponse> getAll();
	
	void add(CreateLanguageFrameworkRequest createLanguageFrameworkRequest);
	void update(int id, UpdateLanguageFrameworkRequest updateLanguageFrameworkRequest);
	void delete(int id);
	
}
