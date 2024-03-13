package ecole.suptechsteam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data @Entity

public class Equipe {
	@Id
	Long id;
	String name;
	String Contry;
	

}
