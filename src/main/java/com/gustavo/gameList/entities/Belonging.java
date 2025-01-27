package com.gustavo.gameList.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPk id = new BelongingPk();

    private Integer posicao;

    public void setGame(Game game) {
        id.setGame(game);
    }

    public Game getGame() {
        return id.getGame();
    }

    public void setList(GameList list) {
        id.setGameList(list);
    }

    public GameList getList() {
        return id.getGameList();
    }

    public Integer getPosition() {
        return posicao;
    }

    public void setPosition(Integer position) {
        this.posicao = position;
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
        Belonging other = (Belonging) obj;
        return Objects.equals(id, other.id);
    }
}
