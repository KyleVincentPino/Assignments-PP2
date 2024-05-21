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

    private storyController storyController;
    private choiceController choiceController;

    public menuController(){
        super();
    }

    @Override
    public void initialize() {
        this.storyController = new storyController();
        this.choiceController = new choiceController();
    }

    @FXML
    public void startClick() throws IOException {
        startGame(startButton);
    }

    public void startGame(Node inputButton) throws IOException {

        SceneManager.setStoryCount(5);
        SceneManager.setStoryScene(1);

        root = FXMLLoader.load(getClass().getResource("storyScene.fxml"));
        stage = (Stage) inputButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void exitClick(){
        exitGame();
    }


}
