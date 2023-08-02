module com.java_text_game.javatextgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.java_text_game.javatextgame to javafx.fxml;
    exports com.java_text_game.javatextgame;
    exports com.java_text_game.javatextgame.controllers;
    opens com.java_text_game.javatextgame.controllers to javafx.fxml;
}