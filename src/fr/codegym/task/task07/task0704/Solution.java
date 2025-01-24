package fr.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Tournez tableau
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[10];
        for (int i = 0; i<10; i++) {
            tableau[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(tableau[i]);
        }
    }
}

