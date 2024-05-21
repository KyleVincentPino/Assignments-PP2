package com.example.game;

import java.util.Random;

public class Cipher {

    private Random rand = new Random();
    private int cipherNum;

    private String[] cipherList = {
            "tixalpiyffpktaqpvazc",
            "pqvjkpitgcnnaocvvgtu"
    };

    private String[] cipherAnswers = {
            "ialoneamthechosenone",
            "nothingreallymatters"
    };

    private String[] hints = {
            "Vigenère - limmy",
            "Caesar - 1 is 2 and 2 is 1"
    };

    public String getCipher(){
        cipherNum = rand.nextInt(cipherList.length);
        return cipherList[cipherNum];
    }

    public String getHint(){
        return hints[cipherNum];
    }

    public boolean solutionCheck(String input, String cipher){
        boolean check = false;
        switch(cipher){
            case "tixalpiyffpktaqpvazc": if (input.equals("ialoneamthechosenone")) {check = true;} break;
            case "pqvjkpitgcnnaocvvgtu": if (input.equals("nothingreallymatters")) {check = true;} break;
            // add more ciphers
            default: check = false; break;
        }
        return check;
    }

}
