package com.example.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class menuController extends SceneController {

    @FXML
    private Button startButton;

    public menuController(){
        super();
    }

    @Override
    public void initialize() {}

    @FXML // STARTS GAME ON CLICK
    private void startClick() throws IOException {
        startGame(startButton);
    }

    // GAME START METHOD
    private void startGame(Node inputButton) throws IOException {
        // RESET ALL NECESSARY VARIABLES
        SceneManager.setStoryCount(5);
        SceneManager.setStoryScene(1);
        SceneManager.resetKarma();

        root = FXMLLoader.load(getClass().getResource("storyScene.fxml"));
        stage = (Stage) inputButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML // CLOSE GAME
    private void exitClick(){
        exitGame();
    }


}
