package com.java_text_game.javatextgame.model;

import com.java_text_game.javatextgame.model.GameEntities.Map;
import com.java_text_game.javatextgame.model.GameEntities.Player;
import com.java_text_game.javatextgame.model.Loader.Loader;
import com.java_text_game.javatextgame.model.Loader.ModelLoader;

import java.io.Serializable;

public class Model implements Observable, Serializable {
    // Реализация шаблона проектирования "Фасад"

    private Loader loader;
    private Model currentModel;
    private Map currentMap;
    private Player player;

    public Model(Player player) {
        loader = new ModelLoader();
        currentMap = new Map(player);
        currentModel = this;
    }

    public void save(String saveName){
        loader.save(currentModel,saveName);
    }
    public void load(String saveName){
        currentModel = loader.load(saveName);
    }

    public Player getPlayer() {
        return player;
    }
}
