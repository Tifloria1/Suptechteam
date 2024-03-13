package ecole.suptechsteamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecole.suptechsteam.entities.Equipe;

@Repository

public interface EquipeRepository extends JpaRepository<Equipe, Long>{
	

}
