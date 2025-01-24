package fr.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
La plus petite ou la plus longue chaîne
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        // Lecture des 10 chaînes
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        // Indices de la plus courte et de la plus longue chaîne
        int indexMin = 0;
        int indexMax = 0;

        // Recherche des indices
        for (int i = 1; i < list.size(); i++) { // Commence à 1 car 0 est déjà initialisé
            if (list.get(i).length() < list.get(indexMin).length()) {
                indexMin = i;
            }
            if (list.get(i).length() > list.get(indexMax).length()) {
                indexMax = i;
            }
        }

        // Déterminer la chaîne à afficher en premier
        int reponse = (indexMin < indexMax) ? indexMin : indexMax;
        System.out.println(list.get(reponse));
    }
}
