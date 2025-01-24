package fr.codegym.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
La plus longue séquence
*/

public class Solution {
    public static void main(String[] args) throws  IOException {
        // Déclare et initialise une ArrayList pour stocker les nombres
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //la soisie
        for (int i = 0; i < 10; i++) {

            //System.out.printf("Saisie %d : ", i + 1);
            list.add(Integer.parseInt(reader.readLine()));
        }

        // con compare a la précédente
        int maxSequence = 1; // Initialisation de la plus longue séquence
        int actuelle = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                actuelle++; // Augmente la séquence actuelle si l'élément est identique
            } else {
                actuelle = 1; // Réinitialise la séquence si l'élément change
            }
            if (actuelle > maxSequence) {
                maxSequence = actuelle; // Met à jour la séquence maximale
            }
        }

       // resultat
        System.out.println(maxSequence);
    }
}
