package com.example.game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

// CHOICE SELECTION SCENE
public class choiceController extends SceneController{
    // VARIABLES
    private int karma = 0;
    private int storyScene = 1;

    @FXML
    private ImageView imageHolder;
    @FXML
    private Button choice1;
    @FXML
    private Button choice2;
    @FXML
    private Button choice3;

    public choiceController(){
        super();
    }

    @Override // INITIALIZE CHOICE SCENE
    public void initialize() {
        storyScene = SceneManager.getStoryScene();
        karma = SceneManager.getKarma();
        if (storyScene == 4) hideChoices();
        setChoices();
    }

    // SETTER AND GETTER METHODS

    private void setChoices(){
        storyScene = SceneManager.getStoryScene();
        String[] choices = new String[3];
        if (storyScene == 4) hideChoices();
        switch(storyScene){
            case 1:
                choices = new String[]{"Drive Away The Bandits", "Slay The Bandits", "Slay Everyone"};
                break;
            case 2:
                choices = new String[]{"Decline And Find On Your Own", "Pay The Merchant", "Use Violence"};
                break;
            case 3:
                choices = new String[]{"Ask The Local For Help", "Figure It Out Yourself", "Assassinate The Local"};
                break;
            case 4:
                choices = new String[]{"DECLINE THE REBELS", "LEAVE EVERYTHING", "JOIN THE REBELS"};
                break;
        }
        getChoices(choices[0], choices[1], choices[2]);
    }

    public void getChoices(String c1, String c2, String c3){
        choice1.setText(c1);
        choice2.setText(c2);
        choice3.setText(c3);
    }

    // KARMA DECIDES WHICH ENDING ARE AVAILABLE AT THE FINAL CHOICE SCENE
    private void addKarma(int choice){
        int[] karmaAdd1 = {5, 5, -10};
        int[] karmaAdd2 = {10, 0, -5};
        int[] karmaAdd3 = {10, -5, -10};
        int karma = -999; // checks error
        switch(storyScene){
            case 1:
                if (choice == 1) karma = karmaAdd1[0];
                else if (choice == 2) karma = karmaAdd1[1];
                else if (choice == 3) karma = karmaAdd1[2];
                break;
            case 2:
                if (choice == 1) karma = karmaAdd2[0];
                else if (choice == 2) karma = karmaAdd2[1];
                else if (choice == 3) karma = karmaAdd2[2];
                break;
            case 3:
                if (choice == 1) karma = karmaAdd3[0];
                else if (choice == 2) karma = karmaAdd3[1];
                else if (choice == 3) karma = karmaAdd3[2];
                break;
            default: karma = 0; break; // error check nullify for stats
        }
        SceneManager.setKarma(karma);
    }

    // CHOICE SELECTION SETTER

    public void choice1click() throws IOException {
        addKarma(1);
        storyScene++;
        SceneManager.setStoryScene(storyScene);
        SceneManager.setChoice(1);
        SceneManager.setChoices(1);
        storyResponse(choice1);
    }

    public void choice2click() throws IOException {
        addKarma(2);
        storyScene++;
        SceneManager.setStoryScene(storyScene);
        SceneManager.setChoice(2);
        SceneManager.setChoices(2);
        storyResponse(choice2);
    }

    public void choice3click() throws IOException{
        addKarma(3);
        storyScene++;
        SceneManager.setStoryScene(storyScene);
        SceneManager.setChoice(3);
        SceneManager.setChoices(3);
        storyResponse(choice3);
    }

    private void hideChoices(){
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        if (karma >= 15) choice1.setVisible(true);
        if (karma >= -15) choice2.setVisible(true);
        if (karma <= -15) choice3.setVisible(true);
    }

    // PLAY RESPONSE SCENE ON THE STORY SCENE SIDE AFTER CHOOSING AN OPTION
    private void storyResponse(Node inputButton) throws IOException {
        SceneManager.swapStoryVal();
        root = FXMLLoader.load(getClass().getResource("storyScene.fxml"));
        stage = (Stage) inputButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    };

}
