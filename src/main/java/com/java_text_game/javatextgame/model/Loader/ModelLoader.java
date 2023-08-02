package com.java_text_game.javatextgame.model.Loader;

import com.java_text_game.javatextgame.model.Model;

import java.io.*;

public class ModelLoader implements Loader {
    // Класс сохраняет и загружет все данные модели в SavedFiles
    private final String DEFAULT_PATH;

    public ModelLoader() {
        DEFAULT_PATH = "./com/java_text_game/javatextgame/model/SavedFiles/";
    }

    @Override
    public Model load(String saveName) {
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(
                             new FileInputStream(
                                     new File(DEFAULT_PATH + saveName)))){
            return (Model) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(Model m, String saveName) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(
                        new File(DEFAULT_PATH + saveName)))) {
            objectOutputStream.writeObject(m);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
