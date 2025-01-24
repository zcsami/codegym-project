package fr.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Mission sur les algorithmes
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        String[] tableau = new String[20];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = lecteur.readLine();
        }

        tri(tableau);

        for (String x : tableau) {
            System.out.println(x);
        }
    }

    public static void tri(String[] tableau) {
        // Algorithme de tri par sélection
        for (int i = 0; i < tableau.length - 1; i++) {
            int indexMin = i; // Trouver l'élément le plus petit
            for (int j = i + 1; j < tableau.length; j++) {
                if (estSuperieurA(tableau[indexMin], tableau[j])) {
                    indexMin = j;
                }
            }
            // Échanger les éléments
            String temp = tableau[i];
            tableau[i] = tableau[indexMin];
            tableau[indexMin] = temp;
        }
    }

    // Méthode de comparaison de chaînes
    public static boolean estSuperieurA(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
