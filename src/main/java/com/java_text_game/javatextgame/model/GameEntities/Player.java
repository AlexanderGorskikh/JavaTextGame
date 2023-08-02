package com.java_text_game.javatextgame.model.GameEntities;

import com.java_text_game.javatextgame.model.Inventory.Inventory;

public abstract class Player {
    // Любой игрок независимо от класса будет хранить в себе свое положение на карте,
    // очки жизни и здоровья, и свой инвентарь
    private Inventory inventory;
    private String playerName;

    private final int[] locate = new int[2];

    private int HP;
    private int MP;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    //TODO создать класс игрока

    public void setX(int x) {
        this.locate[0] = x;
    }

    public void setY(int y) {
        this.locate[1] = y;
    }

    public int[] getLocate() {
        return locate;
    }
}
