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

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;


@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private ProgrammingLanguageService languageService;
	
	@Autowired
	public LanguagesController(ProgrammingLanguageService languageService){
		
		
		this.languageService = languageService;
	}
	
	@GetMapping("/getall") 
	public List<GetAllLanguagesResponse> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) {
		this.languageService.add(createLanguageRequest);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, UpdateLanguageRequest updateLanguageRequest) {
		this.languageService.update(id, updateLanguageRequest);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(int id) {
		languageService.delete(id);
	}
}



