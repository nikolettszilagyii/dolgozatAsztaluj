/*
* File: getNames.java
* Author: Szilágyi Nikolett Viola
* Copyright: 2022, Szilágyi Nikolett Viola
* Group: Szoft-II-N
* Date: 2022-11-02
* Github: https://github.com/nikolettszilagyii/
* Licenc: GNU GPL
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Nevtomb implements getNevek{

    public ArrayList<String> getNevek() {

        String[] nevek = {"Béla", "Géza"};
        ArrayList<String> nevtombb = new ArrayList<>(Arrays.asList(nevek));
        
        return nevtombb;
    }
    
}
