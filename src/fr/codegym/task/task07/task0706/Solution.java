package fr.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Des rues et des maisons
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int[] tableau = new int[15];
        int pair = 0;
        int impair = 0;
        String phrasePair = "Les maisons à numéro pair ont plus de résidents.";
        String phraseImpair = "Les maisons à numéro impair ont plus de résidents.";
        String affichage;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < tableau.length; i++) {
            if(i%2==0){
                pair = pair + tableau[i];
            } else {
                impair = impair + tableau[i];
            }
        }
        affichage = (pair>impair) ? phrasePair : phraseImpair;
        if(pair!=impair){
            System.out.println(affichage);
        }


    }
}
