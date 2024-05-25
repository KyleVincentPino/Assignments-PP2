package com.example.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.IOException;

public class Main extends Application {

    public FXMLLoader FXMLLoader;

    @Override
    public void start(Stage stage) throws IOException {
        // START WITH CIPHER SCENE
        FXMLLoader = new FXMLLoader(Main.class.getResource("cipherScene.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("cipherScene.fxml"));
        Scene scene = new Scene(FXMLLoader.load(), 1000, 600);

        // SET APP DETAILS (ICON, TITLE)
        stage.setTitle("A Squire's Destiny");
        Image icon = new Image(getClass().getResourceAsStream("icon.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}