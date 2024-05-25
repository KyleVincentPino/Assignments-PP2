package com.example.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class endingController extends SceneController{
    // VARIABLES
    @FXML
    private ImageView alignmentSword;
    @FXML
    private Label alignmentText;
    @FXML
    private Button menuButton;
    @FXML
    private TextArea resultBox;
    private int[] choices;
    private String alignment;

    // METHODS
    // SET ENDING ALIGNMENT
    private void setAlignment(){
        int endChoice = choices[3];
        switch(endChoice){
            case 1: alignment = "Good"; break;
            case 2: alignment = "Neutral"; break;
            case 3: alignment = "Evil"; break;
            default: break;
        }
    }

    // SET TEXT ON TEXT AREA
    private void setResultBoxText(){
        resultBox.setText("Congratulations! You got the " + alignment + " Ending!\n\n" +
                "Your Choices:\n" +
                "In The First Crossroad, you chose the " + choices[0] + " option.\n" +
                "In The Second Crossroad, you chose the " + choices[1] + " option.\n" +
                "In The Third Crossroad, you chose the " + choices[2] + " option.\n" +
                "In The Final Crossroad, you chose the " + choices[3] + " ending.\n\n" +
                getEndingDescripton());
    }

    // GET ENDING DESCRIPTION BASED ON ALIGNMENT
    private String getEndingDescripton(){
        String description = "";
        switch(alignment){
            case "Good": description = "In the heart of adversity, the noblest souls rise, wielding the Sword of Destiny to banish the darkness and usher in an era of everlasting peace. For in the crucible of fate, courage and righteousness prevail, ensuring that hope shines eternally upon the kingdom."; break;
            case "Neutral": description = "Amidst the tumult of existence, the wandering soul roams the desolate landscape of indecision, haunted by the echoes of choices left unmade. In the twilight of chaos, introspection becomes their only solace, as they navigate the labyrinth of consequence, seeking meaning amidst the shadows of their own creation."; break;
            case "Evil": description = "In the pursuit of power, darkness consumes the soul, leading down the treacherous path of betrayal and destruction. As the kingdom descends into the abyss of chaos, the usurper's fate is sealed, for in their lust for dominion, they find only emptiness and demise, a testament to the folly of tyranny."; break;
            default: description = "Error, Needs Fixing ASAP!"; break;
        }
        return description;
    }

    // CHANGE SWORD IMAGE BASED ON ALIGNMENT
    private void setAlignmentSword(){
        Image image = new Image(getClass().getResourceAsStream("neutralSword.png"));
        switch(alignment){
            case "Good":
                image = new Image(getClass().getResourceAsStream("goodSword.png"));
                alignmentText.setText("\"GOOD\"");
                break;
            case "Neutral":
                image = new Image(getClass().getResourceAsStream("neutralSword.png"));
                alignmentText.setText("\"NEUTRAL\"");
                break;
            case "Evil":
                image = new Image(getClass().getResourceAsStream("badSword.png"));
                alignmentText.setText("\"EVIL\"");
                break;
            default: break;
        }
        alignmentSword.setImage(image);
    }

    // SET ALL METHODS FOR INITIALIZATION
    private void setResults(){
        setAlignment();
        setAlignmentSword();
        setResultBoxText();
    }

    public endingController(){
        super();
    }

    @Override // INITIALIZE ENDING SCREEN
    public void initialize() {
        choices = SceneManager.getChoices();
        setResults();
        System.out.println("Karma: " + SceneManager.getKarma()); // Karma Error Check
    }

    // BACK TO MENU WHEN BUTTON PRESSED
    public void mainMenu() throws IOException {
        root = FXMLLoader.load(getClass().getResource("menuScene.fxml"));
        stage = (Stage) menuButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // EXIT GAME
    public void exitClick() {
        exitGame();
    }
}
