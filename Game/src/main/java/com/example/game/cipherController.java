package com.example.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class cipherController extends SceneController{
    private Cipher cipher;
    private int wrongCount = 0;

    public cipherController(){
        super();
    }

    @FXML
    private Button inputButton;
    @FXML
    private Label dcText;
    @FXML
    private Label cipherText;
    @FXML
    private Label cipherHint;
    @FXML
    private TextField cipherInput;
    private menuController mc;

    @Override
    public void initialize(){
        cipher = new Cipher();
        cipherText.setText(cipher.getCipher());
        cipherHint.setText(cipher.getHint());
    }

    public void switchToMenu(Node inputButton) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menuScene.fxml"));
        stage = (Stage) inputButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void checkInput() throws IOException {
        Boolean check = cipher.solutionCheck(cipherInput.getText(), cipherText.getText());
        if (check == true) switchToMenu(inputButton);
        else {
            int wR = rand.nextInt(3);
            if (wrongCount == 5) exitGame();
            else wrongCount++;
            switch(wR){
                case 0: dcText.setText("Wrong, try again."); break;
                case 1: dcText.setText("Nope, not it."); break;
                case 2: dcText.setText("Nuh uh, missed it."); break;
                default: dcText.setText("Wrong.");
            }
        }

    }
}