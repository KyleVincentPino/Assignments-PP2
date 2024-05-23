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

public class choiceController extends SceneController{

    private int storyScene = 1;
    private storyController storyController = new storyController();

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

    @Override
    public void initialize() {
        storyScene = SceneManager.getStoryScene();
        setChoices();
    }

    public void setStoryScene() {
        SceneManager.setStoryScene(storyScene);
    }

    public void setChoices(){
        storyScene = SceneManager.getStoryScene();
        String[] choices = new String[3];
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

    public void storyResponse(Node inputButton) throws IOException {
        SceneManager.swapStoryVal();
        root = FXMLLoader.load(getClass().getResource("storyScene.fxml"));
        stage = (Stage) inputButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    };

    public void choice1click() throws IOException {
        storyScene++;
        SceneManager.setStoryScene(storyScene);
        SceneManager.setChoice(1);
        storyResponse(choice1);
    }

    public void choice2click() throws IOException {
        storyScene++;
        SceneManager.setStoryScene(storyScene);
        SceneManager.setChoice(2);
        storyResponse(choice2);
    }

    public void choice3click() throws IOException{
        storyScene++;
        SceneManager.setStoryScene(storyScene);
        SceneManager.setChoice(3);
        storyResponse(choice3);
    }


}
