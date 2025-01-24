package fr.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Par ordre décroissant
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[20];
        for (int i = 0; i < 20; i++) {
            tableau[i] = Integer.parseInt(lecteur.readLine());
        }

        tri(tableau);

        for (int x : tableau) {
            System.out.println(x);
        }
    }

    public static void tri(int[] tableau) {
        int n = tableau.length;

        // Implémentation du tri par sélection
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Trouver l'index du maximum dans la partie non triée
            for (int j = i + 1; j < n; j++) {
                if (tableau[j] > tableau[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Échanger le maximum avec l'élément à la position i
            int temp = tableau[i];
            tableau[i] = tableau[maxIndex];
            tableau[maxIndex] = temp;
        }
    }
}
