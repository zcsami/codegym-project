package fr.codegym.task.task04.task0421;

/* 
Jen ou Jen ?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici

        boolean identique = false;
        boolean memeLongueur = false;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nom1 = reader.readLine();
        String nom2 = reader.readLine();

        if (nom1.equals(nom2)) {
            identique = true;
        }
        if (nom1.length() == nom2.length()) {
            memeLongueur = true;
        }

        if (identique) {
            System.out.println("Les noms sont identiques");
        } else {
            if (memeLongueur) {
                System.out.println("Les noms sont de la même longueur");
            }

        }


    }
}