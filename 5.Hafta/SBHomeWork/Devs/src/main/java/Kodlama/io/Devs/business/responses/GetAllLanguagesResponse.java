package Kodlama.io.Devs.business.responses;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguageFramework;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguagesResponse {
	private int id;
	private String name;
	private List<ProgrammingLanguageFramework> frameworks;
}
