package com.java_text_game.javatextgame.model.Loader;

import com.java_text_game.javatextgame.model.Model;

public interface Loader {
    Model load(String saveName);
    void save(Model m, String saveName);
}
