package ecole.suptechsteam.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Entity @Data

public class Match {
	
	@Id
	Long id;
	Date date;
	Date houre;

}
