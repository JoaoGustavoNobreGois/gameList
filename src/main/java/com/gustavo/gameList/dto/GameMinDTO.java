package com.gustavo.gameList.dto;
import com.gustavo.gameList.entities.Game;
import com.gustavo.gameList.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String descricaoCurta;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity){
        id = entity.getId();
        titulo = entity.getTitulo();
        ano = entity.getAno();
        imgUrl = entity.getImgUrl();
        descricaoCurta = entity.getDescricaoCurta();
    }

    public GameMinDTO(GameMinProjection projection){
        id = projection.getId();
        titulo = projection.getTitulo();
        ano = projection.getAno();
        imgUrl = projection.getImgUrl();
        descricaoCurta = projection.getDescricaoCurta();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Integer getAno() {
        return ano;
    }

    public Long getId() {
        return id;
    }
}
