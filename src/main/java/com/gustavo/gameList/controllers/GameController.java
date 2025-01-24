package com.gustavo.gameList.controllers;

import com.gustavo.gameList.dto.GameDTO;
import com.gustavo.gameList.entities.Game;
import com.gustavo.gameList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> findAll(){
        List<GameDTO> listaDeJogos = gameService.findAll();
        return listaDeJogos;
    }
}
