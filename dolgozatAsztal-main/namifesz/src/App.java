/*
* File: App.java
* Author: Szilágyi Nikolett Viola
* Copyright: 2022, Szilágyi Nikolett Viola
* Group: Szoft-II-N
* Date: 2022-11-02
* Github: https://github.com/nikolettszilagyii/
* Licenc: GNU GPL
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Készitette: Szilágyi Nikolett Viola, Szoft-II-N 2022-11-02");
        
        Nev nevek = new Nev();
        ArrayList<String> nevtombb = nevek.getNames();

        for(String nev : nevtombb) {
            System.out.println(nev);
        }

    }
}
