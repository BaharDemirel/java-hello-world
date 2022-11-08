package Kodlama.io.Devs.webApi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageFrameworkService;
import Kodlama.io.Devs.business.requests.CreateLanguageFrameworkRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageFrameworkRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesFrameworkResponse;



@RestController
@RequestMapping("/api/framework")
public class FrameworkController {
	
	private ProgrammingLanguageFrameworkService languageFrameworkService;
	
	@Autowired
	public FrameworkController(ProgrammingLanguageFrameworkService languageFrameworkService){
		
		
		this.languageFrameworkService = languageFrameworkService;
	}
	
	@GetMapping("/getall") 
	public List<GetAllLanguagesFrameworkResponse> getAll(){
		return languageFrameworkService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageFrameworkRequest createLanguageFrameworksRequest) {
		this.languageFrameworkService.add(createLanguageFrameworksRequest);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, UpdateLanguageFrameworkRequest updateLanguageFrameworkRequest) {
		this.languageFrameworkService.update(id, updateLanguageFrameworkRequest);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(int id) {
		this.languageFrameworkService.delete(id);
	}
	
}



