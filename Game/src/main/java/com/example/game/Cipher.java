package com.example.game;

import java.util.Random;

public class Cipher {

    private Random rand = new Random();
    private int cipherNum;

    private String[] cipherList = { // answers are commented
            "tixalpiyffpktaqpvazc", // ialoneamthechosenone
            "pqvjkpitgcnnaocvvgtu", // nothingreallymatters
            "zwevmgfivzdzrghfh",    // adventureawaitsus
            "ecoiamiqjyicuqggzvax", // courageovercomesfear
            "lnfkdeedoteigogshnm",  // legendsofthekingdom
            "oeucwuynkejnooortlpr", // journeytounlockpower
            "ystimdlbblrcylvlmi",   // mysticallandsawait
            "qcsdlvqlwrcodspgkoqq", // shadowsofthedarkness
            "girfnkslevizwevihrgb", // triumphoveradversity
            "2111441524334423153511313243", // fateinthepalms
            "fpibnfbtmepexabmd",    // epicbattleawaits
            "ptcotqplaqdtmspq",     // secretsofthepast
            "uapscpyivxqyuzcpyy",   // sorceryandmystery
            "athbschbfefrplmz",     // pathofthedestiny
            "rgreanydhrfgortvaf",   // eternalquestbegins
            "afffg fafvf dfvaa afvaa afvav agaaf dxavf gdavd daffg v", // ancientprophecyrevealed
            "eudyhwkhgdunqhvv",     // bravethedarkness
            "rsewtwrdpsqlyuev",     // powerofthechosen
            "tjivvbefubcxgkegpo",   // realmsoftheknights
            "nbtnuxjmibjxgkpctzsi", // victoryinthestruggle
            "chaosunleashed"        // *blank*
    };

    private String[] hints = {
            "Type: Vigenère - LIMMY... that's it.",
            "Type: Caesar - I am always 2 STEPS ahead of you.",
            "Type: Atbash - Suspicious Adventurers everywhere, waiting...",
            "Type: Vigenère - COURAGE is crucial.",
            "Type: Rail Fence - 3 Rails, where is the train?",
            "Type: Transposition - 2 thousand 3 hundred 14 fourteen years, and still clueless.",
            "Type: Playfair - I smell something MYSTICAL in the air.",
            "Type: Keyword - The SHADOWS are talking to me.",
            "Type: Atbash - Never lose to an ADVERSITY, no matter the circumstances.",
            "Type: Polybius Square - The fate of the kingdom is in your hands.",
            "Type: Vigenère - There is nothing epic about this BATTLE.",
            "Type: Keyword - SECRETS should stay as secrets.",
            "Type: Affine - x is 5, and y is 8. Calculate the rise and run.",
            "Type: Playfair - The PATH is open. There is only one end though.",
            "Type: Rot13 - The quest is not ETERNAL... at least, not for you.",
            "Type: ADFGVX - The ANCIENT scriptures have been brought to light.",
            "Type: Caesar - 3rd time's the charm.",
            "Type: Hill - 1 is 2, and 2 is 1. That is not true.",
            "Type: Beaufort - The KNIGHTS are a symbol of justice.",
            "Type: AutoKey - There is no victory without the STRUGGLE.",
            "Type:  - Nothingness. Void Of Thought.",
    };

    // GETTER METHODS
    public String getCipher(){
        cipherNum = rand.nextInt(cipherList.length);
        return cipherList[cipherNum];
    }

    public String getHint(){
        return hints[cipherNum];
    }

    // INPUT CHECK METHOD
    public boolean solutionCheck(String input, String cipher){
        boolean check = false;
        switch(cipher){
            case "tixalpiyffpktaqpvazc": if (input.equals("ialoneamthechosenone")) {check = true;} break;
            case "pqvjkpitgcnnaocvvgtu": if (input.equals("nothingreallymatters")) {check = true;} break;
            case "zwevmgfivzdzrghfh": if (input.equals("adventureawaitsus")) {check = true;} break;
            case "ecoiamiqjyicuqggzvax": if (input.equals("courageovercomesfear")) {check = true;} break;
            case "lnfkdeedoteigogshnm": if (input.equals("legendsofthekingdom")) {check = true;} break;
            case "oeucwuynkejnooortlpr": if (input.equals("journeytounlockpower")) {check = true;} break;
            case "ystimdlbblrcylvlmi": if (input.equals("mysticallandsawait")) {check = true;} break;
            case "qcsdlvqlwrcodspgkoqq": if (input.equals("shadowsofthedarkness")) {check = true;} break;
            case "girfnkslevizwevihrgb": if (input.equals("triumphoveradversity")) {check = true;} break;
            case "2111441524334423153511313243": if (input.equals("fateinthepalms")) {check = true;} break;
            case "fpibnfbtmepexabmd": if (input.equals("epicbattleawaits")) {check = true;} break;
            case "ptcotqplaqdtmspq": if (input.equals("secretsofthepast")) {check = true;} break;
            case "uapscpyivxqyuzcpyy": if (input.equals("sorceryandmystery")) {check = true;} break;
            case "athbschbfefrplmz": if (input.equals("pathofthedestiny")) {check = true;} break;
            case "rgreanydhrfgortvaf": if (input.equals("eternalquestbegins")) {check = true;} break;
            case "afffg fafvf dfvaa afvaa afvav agaaf dxavf gdavd daffg v": if (input.equals("ancientprophecyrevealed")) {check = true;} break;
            case "eudyhwkhgdunqhvv": if (input.equals("bravethedarkness")) {check = true;} break;
            case "rsewtwrdpsqlyuev": if (input.equals("powerofthechosen")) {check = true;} break;
            case "tjivvbefubcxgkegpo": if (input.equals("realmsoftheknights")) {check = true;} break;
            case "nbtnuxjmibjxgkpctzsi": if (input.equals("victoryinthestruggle")) {check = true;} break;
            case "chaosunleashed" : if (input.equals("")) {check = true;} break;
            default: check = false; break; // delete instantiate check at FINAL
        }
        return check;
    }

}
