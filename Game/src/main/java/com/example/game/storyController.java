package com.example.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class storyController extends SceneController{

    // VARIABLES
    private int storyCount = 5;
    private int scenePart = 0;
    public String[] storyText = new String[0];
    private Story story = new Story();
    private int storyVal = 0;

    @FXML
    private ImageView imageHolder;
    @FXML
    private Label textHolder = new Label();
    @FXML
    private Button nextButton = new Button();


    public storyController(){
        super();
    }

    @Override // INITIALIZE USING SCENE MANAGER
    public void initialize() throws IOException{
        SceneManager.resetScenePart();
        storyVal = SceneManager.getStoryVal();
        scenePart = SceneManager.getScenePart();
        storyCount = SceneManager.getStoryCount();
    }

    public void setStoryCount(){ // SET STORY COUNT
        SceneManager.setStoryCount(storyCount);
    }

    @FXML // METHOD THAT PROGRESSES THE SCENES IF NEXT BUTTON PRESSED
    public void nextClick() throws IOException{
        if (storyVal == 1) playResponseScene();
        else {
            switch (storyCount) {
                case 5:
                    playIntro();
                    break;
                case 4:
                    playFirstPart();
                    break;
                case 3:
                    playSecondPart();
                    break;
                case 2:
                    playThirdPart();
                    break;
                case 1:
                    playFourthPart();
                    break;
                default:
                    break;
            }
        }
    }
    // PLAY CHOICE SCENE
    public void playChoiceScene() throws IOException {
        cs();
    }
    // TRANSITION TO CHOICE SELECTION SCENE
    public void cs() throws IOException {
        root = FXMLLoader.load(getClass().getResource("choiceScene.fxml"));
        stage = (Stage) nextButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // PLAY RESPONSE SCENE METHOD
    public void playResponseScene() throws IOException{
        int choice = SceneManager.getChoice();
        storyCount = SceneManager.getStoryCount();
        sc(choice);
    }
    @FXML // RESPONSE SCENE
    public void sc(int choice) throws IOException{
        switch(storyCount){
            case 4: storyText = story.firstResponses(choice); break;
            case 3: storyText = story.secondResponses(choice); break;
            case 2: storyText = story.thirdResponses(choice); break;
            case 1: storyText = story.getEnding(choice); break;
            default: break;
        }

        if (scenePart < storyText.length) {
            textHolder.setText(storyText[scenePart]);
            scenePart++;
        }
        else {
            storyCount--;
            scenePart = 0;
            SceneManager.swapStoryVal();
            storyVal = SceneManager.getStoryVal();
            setStoryCount();

            switch(storyCount){
                case 3: playSecondPart(); break;
                case 2: playThirdPart(); break;
                case 1: playFourthPart(); break;
                default: toEndScreen(); break;
            }
        }
    }

    public void toEndScreen() throws IOException{
        root = FXMLLoader.load(getClass().getResource("endingScene.fxml"));
        stage = (Stage) nextButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // METHODS TO RUN PARTS -----------------------

    public void playIntro() throws IOException{
        storyText = story.getIntro();
        if (scenePart < storyText.length) {
            textHolder.setText(storyText[scenePart]);
            scenePart++;
        }
        else {
            storyCount--;
            scenePart = 0;
            setStoryCount();
            playFirstPart();
        }
    }

    public void playFirstPart() throws IOException {
        storyText = story.firstPart();

        if (scenePart < storyText.length) {
            textHolder.setText(storyText[scenePart]);
            scenePart++;
        }
        else {
            playChoiceScene();
            scenePart = 0;
        }
    }

    public void playSecondPart() throws IOException {
        storyText = story.secondPart();
        if (scenePart < storyText.length) {
            textHolder.setText(storyText[scenePart]);
            scenePart++;
        }
        else {
            playChoiceScene();
            scenePart = 0;
        }
    }

    public void playThirdPart() throws IOException {
        storyText = story.thirdPart();
        if (scenePart < storyText.length) {
            textHolder.setText(storyText[scenePart]);
            scenePart++;
        }
        else {
            playChoiceScene();
            scenePart = 0;
        }
    }

    public void playFourthPart() throws IOException {
        storyText = story.fourthPart();
        if (scenePart < storyText.length) {
            textHolder.setText(storyText[scenePart]);
            scenePart++;
        }
        else {
            playChoiceScene();
            scenePart = 0;
        }
    }


}
