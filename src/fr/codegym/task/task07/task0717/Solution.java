package fr.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplication de mots
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        ArrayList<String> liste = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            liste.add(reader.readLine());
        }

        ArrayList<String> resultat = dupliquerValeurs(liste);

        // Display result
        for (String s : resultat) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> dupliquerValeurs(ArrayList<String> liste) {
        //écris ton code ici
        ArrayList<String> resultat = new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            resultat.add(liste.get(i));
            resultat.add(liste.get(i));
        }
        return resultat;
    }
}
