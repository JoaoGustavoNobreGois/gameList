package com.gustavo.gameList.repositories;

import com.gustavo.gameList.entities.Game;
import com.gustavo.gameList.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.titulo, tb_game.ano AS `year`, tb_game.img_url AS imgUrl,
		tb_game.descricao_curta AS descricaoCurta, tb_belonging.posicao
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.posicao
			""")
    List<GameMinProjection> searchByList(Long listId);
}
