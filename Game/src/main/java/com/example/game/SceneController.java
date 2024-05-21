package com.example.game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public abstract class SceneController {
    public Random rand = new Random();

    protected Stage stage;
    protected Scene scene;
    protected Parent root;

    public SceneController(){
        this.stage = SceneManager.getStage();
        this.scene = SceneManager.getScene();
        this.root = SceneManager.getRoot();
    }

    public void exitGame(){
        System.exit(0);
    }

    public abstract void initialize() throws IOException;
}

