package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;

public interface ProgrammingLanguageService {

	List<GetAllLanguagesResponse> getAll();
	
	void add(CreateLanguageRequest createLanguageRequest);
	void update(int id, UpdateLanguageRequest updateLanguageRequest);
	void delete(int id);
}
