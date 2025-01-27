package com.gustavo.gameList.services;

import com.gustavo.gameList.dto.GameListDTO;
import com.gustavo.gameList.entities.GameList;
import com.gustavo.gameList.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> listaDeJogos = gameListRepository.findAll();
        return listaDeJogos.stream().map(x -> new GameListDTO(x)).toList();
    }
}
