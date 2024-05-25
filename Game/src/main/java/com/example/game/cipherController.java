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

    @Override // INITIALIZE CIPHER
    public void initialize(){
        cipher = new Cipher();
        cipherText.setText(cipher.getCipher());
        cipherHint.setText(cipher.getHint());
    }

    // TRANSITION TO MENU SCENE
    public void switchToMenu(Node inputButton) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menuScene.fxml"));
        stage = (Stage) inputButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void toSecretScene(Node inputButton) throws IOException{
        root = FXMLLoader.load(getClass().getResource("secretScene.fxml"));
        stage = (Stage) inputButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML // INPUT CHECK METHOD, WHERE, IF WRONG INPUTS FOR 5 TRIES, IMMEDIATE APPLICATION END.
    protected void checkInput() throws IOException {
        if (cipherInput.getText().equals("oursecretstayswithus")) toSecretScene(inputButton); // go to credits
        else {
            Boolean check = cipher.solutionCheck(cipherInput.getText(), cipherText.getText());
            if (check == true) switchToMenu(inputButton);
            else {
                int wR = rand.nextInt(6);
                if (wrongCount == 5) exitGame();
                else wrongCount++;
                switch (wR) { // Dissing wrong attempts list randomized
                    case 0:
                        dcText.setText("Wrong, try again.");
                        break;
                    case 1:
                        dcText.setText("Nope, not it.");
                        break;
                    case 2:
                        dcText.setText("Nuh Uh.");
                        break;
                    case 3:
                        dcText.setText("Do Better.");
                        break;
                    case 4:
                        dcText.setText("Are You Even Trying?");
                        break;
                    case 5:
                        dcText.setText("Stop, just quit.");
                        break;

                }
            }
        }

    }
}