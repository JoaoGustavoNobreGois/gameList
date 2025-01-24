package com.gustavo.gameList.repositories;

import com.gustavo.gameList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
