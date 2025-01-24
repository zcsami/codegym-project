package fr.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Chiffres croissants
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] tableau = new int[5];
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));



        //écris ton code ici

        for (int i = 0; i < 5; i++) {
            tableau[i] = Integer.parseInt(lecteur.readLine());
        }
        Arrays.sort(tableau);

        for(int i : tableau) {
            System.out.println(i);

        }


    }
}
