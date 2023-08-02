package com.java_text_game.javatextgame.model.GameEntities;

import com.java_text_game.javatextgame.model.MapElement.MapElement;

public class Map {
    // Сущность игрового мира, по которому Player будет перемещаться
    // Тут будет карта, каждый ход(изменение Player x или y)
    // будет вызываться событие наследуемое от Event,и увеличивать время дня,
    // при некоторых значениях дня наступает ночь,
    // которая увеличивает вероятность плохих событий(Event);
    // каждому x и y соответствует своя сущность элемента карты
    // (горы, лес, река, город и тд)
    // на одной клетке может находиться только один элемент карты,

    private static final int MAP_SIZE = 40; // Квадратная карта на 40 клеток
    private static int time;
    private final int[] SPAWN_POINT = new int[2];

    private MapElement[][] land; // Основа карты - двумерный массив элементов карты
    private Player player;

    private int x;
    private int y;

    public Map(Player player) {
        this.player = player;
        SPAWN_POINT[0] = 15;
        SPAWN_POINT[1] = 15; // Место где появляется игрок при создании карты
        land = new MapElement[MAP_SIZE][MAP_SIZE];
        player.setX(15);
        player.setY(15);
    }

    public MapElement getLocate(){
        return land[player.getLocate()[0]][player.getLocate()[1]]; // Метод получения элемента карты на котором стоит игрок
    }

}
