package com.example.game;

public class Story {

    // VARIABLES

    private int StoryNum = 0;
    private int[] choiceList = new int[4];
    private int storyChoice;

    // GET STORY METHODS -------------------------

    public String[] getIntro(){
        return new String[]{
                "Once upon a time in the kingdom of Eldoria, there lived a young squire named Alden.",
                "He dreamed of becoming a noble knight and serving his kingdom with honor and valor.",
                "Little did he know that his destiny would shape the fate of the entire realm.",
                "One fateful day, Alden was summoned by the king himself. The kingdom was in turmoil,threatened by external invaders and internal unrest.",
                "The king entrusted Alden with a sacred quest: to retrieve the legendary Sword of Destiny, said to hold the power to unite the kingdom and restore peace.",
                "As Alden embarks on his journey, he will encounter various trials and challenges, each with the potential to alter the course of history."
        };
    }

    public String[] firstPart(){
        return new String[] {
                "While traveling through a dense forest, Alden stumbles upon a group of bandits harassing a group of villagers.",
                "He has the option to intervene and help the villagers, fight the bandits, or ignore the situation and continue on his journey.",
                "What will Alden choose?"
        };
    }

    public String[] secondPart(){
        return new String[] {
                "In a bustling marketplace, Alden encounters a mysterious stranger.",
                "They offer him a shortcut to his destination in exchange for a hefty sum of gold.",
                "What will Alden do?"
        };
    }

    public String[] thirdPart(){
        return new String[] {
                "Along his journey, Alden comes across a set of ancient ruins.",
                "It is rumored to be haunted by vengeful spirits. Somebody seems to live near it.",
                "What is Alden's plan?"
        };
    }

    public String[] fourthPart(){
        return new String[] {
                "As Alden's destination comes near, he is approached by a group of rebels who sought to overthrow the king.",
                "They offered him a chance to join their cause and promised him riches and power.",
                "What is Alden's will?"
        };
    }

    // GET RESPONSES ------------------------

    public String[] firstResponses(int choice){
        choiceList[0] = choice;
        String[] response = new String[0];
        switch(choice){
            case 1:
                response = new String[]{
                        "Alden fights the bandits, valiantly defending the villagers and driving the attackers away.",
                        "Grateful for his bravery, the villagers offers him gold as thanks for saving them.",
                        "Alden accepts the gesture with grace and vows to continue his quest with renewed determination."
                };
                break;
            case 2:
                response = new String[]{
                        "Alden proceeds to slay the bandits with no mercy. Blood spills the ground eerily.",
                        "Having swiftly dispatched the bandits, Alden witnesses the dread in the eyes of the trembling villagers, who hastily offered their meager possessions in fear.",
                        "He took their offerings and left. Focusing on the path, his heart set on claiming the Sword of Destiny."
                };
                break;
            case 3:
                response = new String[]{
                        "Suddenly, Alden mercilessly slew both the bandits and the innocent villagers. He casually plunders both villager and bandit's belongings.",
                        "With blood on his hands and stolen riches in tow, he callously abandons the scene, leaving behind a trail of devastation and despair.",
                        "Alden continues on his path to retrieve the Sword of Destiny."
                };
                break;
            default: break;
        }
        return response;
    }

    public String[] secondResponses(int choice){
        choiceList[1] = choice;
        String[] response = new String[0];
        switch(choice){
            case 1:
                response = new String[]{
                    "Despite the allure of a shortcut, Alden steadfastly declines the merchant's offer, relying on his own determination to find the Sword of Destiny.",
                    "Along his journey, he selflessly aids numerous individuals in need, embodying the virtues of compassion and bravery.",
                    "At last, he finally reaches the place where the sword is presumed to be."
            };
                break;
            case 2:
                response = new String[]{
                    "Alden chooses to pay the merchant for the map, setting his course towards the location pointed by it.",
                    "With the guidance of the map, his journey is swift and direct, devoid of the trials and tribulations faced by those who wander alone.",
                    "Arriving at the location, Alden continues his goal of acquiring the sword."
            };
                break;
            case 3:
                response = new String[]{
                    "Alden intimidates the merchant into compliance, securing the map through fear and violence.",
                    "After getting the map, Alden kills the merchant to hide any trace of his act.",
                    "Following the bloodstained map, he marches to the destination."
                };
                break;
            default: break;
        }
        return response;
    }

    public String[] thirdResponses(int choice){
        choiceList[2] = choice;
        String[] response = new String[0];
        switch(choice){
            case 1:
                response = new String[]{
                        "Alden consults the local in the vicinity. It was a wizard who frequents the ruins.",
                        "With the help of the wizard, Alden reached the end of the haunted ruins.",
                        "Finally, he now has acquired THE SWORD OF DESTINY. Alden prepares to go back to the kingdom."
                };
                break;
            case 2:
                response = new String[]{
                        "Alden went straight to the ruins, without any plan or help whatsoever.",
                        "As he is walking inside the ruins, undead blocked his way, but that didn't stop him from getting to the end.",
                        "Acquiring THE SWORD OF DESTINY, he prepares to go back to the kingdom."
                };
                break;
            case 3:
                response = new String[]{
                        "Alden assassinated the local behind the back. He then proceeds to loot his body and gets a map of the whole ruins.",
                        "Alden proceeds to follow the map inside the ruins. Somehow, there is nothing haunted about the ruins.",
                        "Reaching the end, he acquires THE SWORD OF DESTINY and proceeds to hurry back to the kingdom."
                };
                break;
            default: break;
        }
        return response;
    }

    // GET ENDING

    public String[] getEnding(int alignment){
        String [] end = new String[3];
        String[] good = {
                "Remembering his oath to serve his kingdom with honor and valor, Alden remained steadfast in his allegiance.",
                "With the Sword of Destiny by his side, he fought against the rebels and chased them away for life.",
                "In the end, Alden won and restored peace and prosperity to Eldoria, ensuring a bright future for generations to come."
        };
        String[] neutral = {
                "At the crossroads of good and evil, Alden chose not to do anything and decided to leave the rebels and the kingdom on its own.",
                "Without Alden, there was nothing to prevent the kingdom from descending into chaos and conflict.",
                "As the flames of war engulfed Eldoria, Alden aimlessly wanders the land, wondering if there was a better choice he could've made."
        };
        String[] bad = {
                "Alden saw an opportunity to seize power for himself. He accepts the rebels' proposal and went to the kingdom.",
                "He led the rebels in a violent uprising against the king, and the kingdom descended into chaos and despair.",
                "At the climax of war, he gets slashed in the chest by the royal knights, dying a dog's death."
        };
        switch(alignment){
            case 1: end = good; break;
            case 2: end = neutral; break;
            case 3: end = bad; break;
            default: break;
        }
        return end;
    }

}
