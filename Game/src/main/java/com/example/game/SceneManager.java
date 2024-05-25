package com.example.game;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// THIS CLASS HOLDS ALL OF THE DETAILS THAT CONTROL WHAT HAPPENS IN THE GAME
public class SceneManager{

    // VARIABLES
    private static Stage stage;
    private static Scene scene;
    private static Parent root;
    public static int storyCount;
    public static int[] choices = new int[4];
    public static int choice = 1;
    public static int storyScene;
    public static int scenePart;
    public static int storyVal = 0;
    public static int karma = 0;

    // SCENE SETTER AND GETTER METHODS (FOR TRANSITIONING SCENES)
    public static void setStage(Stage stage) {
        SceneManager.stage = stage;
    }

    public static void setScene(Scene scene) {
        SceneManager.scene = scene;
    }

    public static void setRoot(Parent root) {
        SceneManager.root = root;
    }

    public static Stage getStage() {
        return stage;
    }

    public static Scene getScene() {
        return scene;
    }

    public static Parent getRoot() {
        return root;
    }

    // VARIABLE GETTER AND SETTER FOR STORY PROGRESSION

    public static void resetKarma(){
        karma = 0;
    }

    public static void setKarma(int num){
        karma = karma + num;
    }

    public static void swapStoryVal(){
        if (storyVal == 0) storyVal = 1;
        else storyVal = 0;
    }

    public static int getStoryVal(){
        return storyVal;
    }

    public static void setChoice(int choice){
        SceneManager.choice = choice;
    }

    public static void setStoryScene(int storyScene){
        SceneManager.storyScene = storyScene;
    }

    public static void setStoryCount(int storyCount){
        SceneManager.storyCount = storyCount;
    }

    public static void setChoices(int choice){
        switch(storyCount){
            case 4: choices[0] = getChoice(); break;
            case 3: choices[1] = getChoice(); break;
            case 2: choices[2] = getChoice(); break;
            case 1: choices[3] = getChoice(); break;
            default: break;
        }
    }

    public static void resetScenePart(){
        SceneManager.scenePart = 0;
    }

    public static int getKarma(){
        return karma;
    }

    public static int getStoryScene(){
        return storyScene;
    }

    public static int getStoryCount(){
        return storyCount;
    }

    public static int[] getChoices(){
        return choices;
    }

    public static int getChoice(){
        return choice;
    }

    public static int getScenePart(){
        return scenePart;
    }
}
