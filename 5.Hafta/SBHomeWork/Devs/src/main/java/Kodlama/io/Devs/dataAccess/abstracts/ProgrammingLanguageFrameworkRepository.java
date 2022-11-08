package Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguageFramework;

public interface ProgrammingLanguageFrameworkRepository extends JpaRepository<ProgrammingLanguageFramework, Integer>{
	

}
