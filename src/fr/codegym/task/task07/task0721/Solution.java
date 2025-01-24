package fr.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Minimum et maximum dans les tableaux
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[20];

        for (int i = 0; i <20 ; i++) {
            tableau[i] = Integer.parseInt(lecteur.readLine());
        }


        int maximum;
        int minimum;

        maximum = tableau[0];
        minimum = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < minimum) {
                minimum = tableau[i];
            }
            if (tableau[i] > maximum) {
                maximum = tableau[i];
            }
        }


        System.out.println(maximum+" "+minimum);


    }
}
