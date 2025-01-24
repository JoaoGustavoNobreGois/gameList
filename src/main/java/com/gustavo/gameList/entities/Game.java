package com.gustavo.gameList.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String plataforma;
    private Double nota;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String descricaoCurta;

    @Column(columnDefinition = "TEXT")
    private String descricaoLonga;

    public Game() {
    }

    public Game(Long id, String titulo, Integer ano, String genero, String plataforma, Double nota, String imgUrl,
                String descricaoCurta, String descricaoLonga) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.plataforma = plataforma;
        this.nota = nota;
        this.imgUrl = imgUrl;
        this.descricaoCurta = descricaoCurta;
        this.descricaoLonga = descricaoLonga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGeneroe() {
        return genero;
    }

    public void setGenerore(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }

    public String getDescricaoLonga() {
        return descricaoLonga;
    }

    public void setDescricaoLonga(String descricaoLonga) {
        this.descricaoLonga = descricaoLonga;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        return Objects.equals(id, other.id);
    }
}
