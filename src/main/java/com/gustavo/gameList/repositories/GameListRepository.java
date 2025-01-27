package com.gustavo.gameList.repositories;

import com.gustavo.gameList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
