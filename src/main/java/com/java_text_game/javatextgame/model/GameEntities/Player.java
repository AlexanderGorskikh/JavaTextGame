package com.java_text_game.javatextgame.model.GameEntities;

import com.java_text_game.javatextgame.model.Inventory.Inventory;

public abstract class Player {
    // Любой игрок независимо от класса будет хранить в себе свое положение на карте,
    // очки жизни и здоровья, и свой инвентарь
    private Inventory inventory;

    private int x;
    private int y;

    private int HP;
    private int MP;

    //TODO создать класс игрока
}
