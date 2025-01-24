package fr.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changement de fonctionnalité
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
    // liste initiale
        ArrayList<String> liste = new ArrayList<String>();
        while (true) {
            String s = lecteur.readLine();
            if (s.isEmpty()) break;
            liste.add(s);
        }

    // liste MAJ
        for(int i = 0; i < liste.size(); i++) {
            String s = liste.get(i).toUpperCase();
            liste.set(i,s);
        }

        // Liste finale
        ArrayList<String> resultat = new ArrayList<>();

        for (int i = 0; i < liste.size(); i++) {
            if(liste.get(i).length() %2 ==0){
                resultat.add(liste.get(i)+ " "+ liste.get(i));

            } else {
                resultat.add(liste.get(i)+" "+ liste.get(i)+" "+liste.get(i));

            }
        }


        for(String s : resultat) {
            System.out.println(s);
        }



    }
}
