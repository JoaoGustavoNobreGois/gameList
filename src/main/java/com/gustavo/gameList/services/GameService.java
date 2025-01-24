package com.gustavo.gameList.services;

import com.gustavo.gameList.dto.GameDTO;
import com.gustavo.gameList.entities.Game;
import com.gustavo.gameList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll(){
        List<Game> listaDeJogos = gameRepository.findAll();
        List<GameDTO> dto = listaDeJogos.stream().map(x -> new GameDTO(x)).toList();
        return dto;
    }
}
