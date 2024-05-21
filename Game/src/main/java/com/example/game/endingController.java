package com.example.game;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class endingController extends SceneController{

    private int[] choices;

    public endingController(){
        super();
    }

    @Override
    public void initialize() {
        choices = SceneManager.getChoices();
    }

}
