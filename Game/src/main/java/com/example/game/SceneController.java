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

// THE MOTHER OF ALL SCENES (IS IT NECESSARY? TO RUN THE GAME - NO. TO SIMPLIFY MY JOB - YES.)
public abstract class SceneController {
    public Random rand = new Random();

    protected Stage stage;
    protected Scene scene;
    protected Parent root;

    // SCENE CONSTRUCTOR
    public SceneController(){
        this.stage = SceneManager.getStage();
        this.scene = SceneManager.getScene();
        this.root = SceneManager.getRoot();
    }

    public void exitGame(){
        System.exit(0);
    } // SIMPLIFIED EXIT TO BE USED BY 3 SCENES (CIPHER, MENU, ENDING)

    public abstract void initialize() throws IOException; // INITIALIZATION ABSTRACT FOR DIFFERENT TYPE OF SCENE INITIALIZATIONS
}

