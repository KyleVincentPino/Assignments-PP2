package com.example.game;

import javafx.scene.image.Image;

// HANDLES STORY SCENE AND CHOICE SCENE IMAGES, CREATED FOR ACCESSIBILITY
public class ImageManager {

    // VARIABLES
    public Image image;
    public Image[] images;
    public int imageNumber = 0;

    // SETTER AND GETTER METHODS

    public Image getImage(){
        return image;
    }

    public void setImageNumber(){
        if (imageNumber < images.length) imageNumber++;
        else imageNumber = 0;
    }

    public void setStoryImage(){
        image = images[imageNumber];
    }

    // SETS THE LIST OF IMAGES THAT ARE GONNA BE USED ON THE STORY, DEPENDING WHICH PART OF THE STORY YOU ARE ON
    public void getStoryImage(){
        Image[] imageList = new Image[0];
        switch(SceneManager.getStoryCount()){
            case 5:
                imageList = new Image[]{
                        new Image(getClass().getResourceAsStream("intro.png")),
                        new Image(getClass().getResourceAsStream("intro.png")),
                        new Image(getClass().getResourceAsStream("intro.png")),
                        new Image(getClass().getResourceAsStream("intro1.png")),
                        new Image(getClass().getResourceAsStream("intro2.png")),
                        new Image(getClass().getResourceAsStream("intro3.png"))
                };
                break;
            case 4:
                imageList = new Image[]{
                        new Image(getClass().getResourceAsStream("first.png")),
                        new Image(getClass().getResourceAsStream("first.png")),
                        new Image(getClass().getResourceAsStream("first.png"))
                };
                break;
            case 3:
                imageList = new Image[]{
                        new Image(getClass().getResourceAsStream("second.png")),
                        new Image(getClass().getResourceAsStream("second.png")),
                        new Image(getClass().getResourceAsStream("second.png"))
                };
                break;
            case 2:
                imageList = new Image[]{
                        new Image(getClass().getResourceAsStream("third.png")),
                        new Image(getClass().getResourceAsStream("third.png")),
                        new Image(getClass().getResourceAsStream("third.png"))
                };
                break;
            case 1:
                imageList = new Image[]{
                        new Image(getClass().getResourceAsStream("final.png")),
                        new Image(getClass().getResourceAsStream("final1.png")),
                        new Image(getClass().getResourceAsStream("final1.png"))
                };
                break;
        }
        images = imageList;
    }

}
