package ecole.suptechsteamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecole.suptechsteam.entities.Player;


@Repository

public interface PlayerRepository extends JpaRepository<Player, Long>{
	

	

}
