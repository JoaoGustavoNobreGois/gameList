package com.gustavo.gameList.controllers;

import com.gustavo.gameList.dto.GameDTO;
import com.gustavo.gameList.dto.GameMinDTO;
import com.gustavo.gameList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }

    public List<GameMinDTO> findAll(){
        List<GameMinDTO> listaDeJogos = gameService.findAll();
        return listaDeJogos;
    }
}
