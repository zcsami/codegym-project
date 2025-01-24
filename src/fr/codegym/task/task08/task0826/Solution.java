package fr.codegym.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Cinq gagnants
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[20];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = Integer.parseInt(lecteur.readLine());
        }

        tri(tableau);

        System.out.println(tableau[0]);
        System.out.println(tableau[1]);
        System.out.println(tableau[2]);
        System.out.println(tableau[3]);
        System.out.println(tableau[4]);
    }

    public static void tri(int[] tableau) {
        //écris ton code ici
        for (int i = 0; i < tableau.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[j] > tableau[maxIndex]) { // Trouver le maximum
                    maxIndex = j;
                }
            }

            // Échange des éléments
            int temp = tableau[i];
            tableau[i] = tableau[maxIndex];
            tableau[maxIndex] = temp;
        }


    }
}
