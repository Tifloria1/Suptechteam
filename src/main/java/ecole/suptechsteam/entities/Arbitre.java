package ecole.suptechsteam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Entity @Data

public class Arbitre {
	@Id
	
	Long id;
	String name;
	String Nationality;

}
