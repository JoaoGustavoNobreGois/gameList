package com.gustavo.gameList.services;

import com.gustavo.gameList.dto.GameDTO;
import com.gustavo.gameList.dto.GameMinDTO;
import com.gustavo.gameList.entities.Game;
import com.gustavo.gameList.projections.GameMinProjection;
import com.gustavo.gameList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> listaDeJogos = gameRepository.findAll();
        List<GameMinDTO> dto = listaDeJogos.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByGameList(Long listId){
        List<GameMinProjection> listaDeJogos = gameRepository.searchByList(listId);
        List<GameMinDTO> dto = listaDeJogos.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
