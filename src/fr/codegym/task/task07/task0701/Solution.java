package fr.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum dans un tableau
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] tableau = initialiserTableau();
        int max = max(tableau);
        System.out.println(max);
    }

    public static int[] initialiserTableau() throws IOException {
        // Create and populate the array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[20];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = Integer.parseInt(reader.readLine());
        }
        return tableau;
    }

    public static int max(int[] tableau) {
        // Find the maximum
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }
}
