package com.example.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class secretController extends SceneController{
    @FXML
    private Button menuButton = new Button();

    @Override
    public void initialize() throws IOException {}

    public void switchToMenu() throws IOException {
        root = FXMLLoader.load(getClass().getResource("menuScene.fxml"));
        stage = (Stage) menuButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
