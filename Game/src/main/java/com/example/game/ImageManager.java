package com.example.game;

import javafx.scene.image.Image;

// HANDLES STORY SCENE AND CHOICE SCENE IMAGES, CREATED FOR ACCESSIBILITY
public class ImageManager {

    public Image[] imageList;
    // SETTER AND GETTER METHODS

    public Image[] getImageList(){
        if (SceneManager.getStoryVal() == 1) imageList = getResponseImages();
        else imageList = getStoryImages();
        return imageList;
    }

    // SETS THE LIST OF IMAGES THAT ARE GOING TO BE USED ON THE STORY, DEPENDING ON WHICH PART OF THE STORY YOU ARE AT
    public Image[] getStoryImages(){
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
                        new Image(getClass().getResourceAsStream("final.png")),
                        new Image(getClass().getResourceAsStream("final.png"))
                };
                break;
        }
        return imageList;
    }

    // SET CHOICE SCENE IMAGES
    public Image getChoiceImage(){
        Image image = new Image(getClass().getResourceAsStream("intro.png"));
        switch(SceneManager.getStoryCount()){
            case 4:
                image = new Image(getClass().getResourceAsStream("first.png"));
                break;
            case 3:
                image = new Image(getClass().getResourceAsStream("second.png"));
                break;
            case 2:
                image = new Image(getClass().getResourceAsStream("third.png"));
                break;
            case 1:
                image = new Image(getClass().getResourceAsStream("final.png"));
                break;
        }
        return image;
    }

    // SETS THE LIST OF IMAGES BASED ON WHAT OPTION YOU CHOSE
    public Image[] getResponseImages(){
        Image[] imageList = new Image[0];
        int choice = SceneManager.getChoice();
        if (choice == 1) {
            switch (SceneManager.getStoryCount()) {
                case 4:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("first1-1.png")),
                            new Image(getClass().getResourceAsStream("first1-2.png")),
                            new Image(getClass().getResourceAsStream("first1-3.png"))
                    };
                    break;
                case 3:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("second1-1.png")),
                            new Image(getClass().getResourceAsStream("second1-2.png")),
                            new Image(getClass().getResourceAsStream("second1-3.png"))
                    };
                    break;
                case 2:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("third1-1.png")),
                            new Image(getClass().getResourceAsStream("third1-2.png")),
                            new Image(getClass().getResourceAsStream("third1-3.png"))
                    };
                    break;
                case 1:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("final1-1.png")),
                            new Image(getClass().getResourceAsStream("final1-2.png")),
                            new Image(getClass().getResourceAsStream("final1-3.png"))
                    };
                    break;
            }
        }
        else if (choice == 2) {
            switch (SceneManager.getStoryCount()) {
                case 4:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("first2-1.png")),
                            new Image(getClass().getResourceAsStream("first2-2.png")),
                            new Image(getClass().getResourceAsStream("first2-3.png"))
                    };
                    break;
                case 3:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("second2-1.png")),
                            new Image(getClass().getResourceAsStream("second2-2.png")),
                            new Image(getClass().getResourceAsStream("second2-3.png"))
                    };
                    break;
                case 2:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("third2-1.png")),
                            new Image(getClass().getResourceAsStream("third2-2.png")),
                            new Image(getClass().getResourceAsStream("third2-3.png"))
                    };
                    break;
                case 1:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("final2-1.png")),
                            new Image(getClass().getResourceAsStream("final2-2.png")),
                            new Image(getClass().getResourceAsStream("final2-3.png"))
                    };
                    break;
            }
        }
        else if (choice == 3) {
            switch (SceneManager.getStoryCount()) {
                case 4:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("first3-1.png")),
                            new Image(getClass().getResourceAsStream("first3-2.png")),
                            new Image(getClass().getResourceAsStream("first3-3.png"))
                    };
                    break;
                case 3:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("second3-1.png")),
                            new Image(getClass().getResourceAsStream("second3-2.png")),
                            new Image(getClass().getResourceAsStream("second3-3.png"))
                    };
                    break;
                case 2:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("third3-1.png")),
                            new Image(getClass().getResourceAsStream("third3-2.png")),
                            new Image(getClass().getResourceAsStream("third3-3.png"))
                    };
                    break;
                case 1:
                    imageList = new Image[]{
                            new Image(getClass().getResourceAsStream("final3-1.png")),
                            new Image(getClass().getResourceAsStream("final3-2.png")),
                            new Image(getClass().getResourceAsStream("final3-3.png"))
                    };
                    break;
            }
        }
        return imageList;
    }

}
