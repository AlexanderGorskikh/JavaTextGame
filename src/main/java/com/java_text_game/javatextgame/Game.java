package com.java_text_game.javatextgame;

import com.java_text_game.javatextgame.model.Observable;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application implements Observable {

    private static final int TILE_SIZE = 40;
    private static final int W = 800;
    private static final int H = 600;

    private Parent createContent(){
        Pane root = new Pane();
        root.setPrefSize(W,H);
        return root;
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Game.class.getResource("GameView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), W, H);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}