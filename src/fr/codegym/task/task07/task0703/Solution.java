package fr.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Interactions entre tableaux isolés
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        String[] chaines = new String[10];
        int [] nombres = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            chaines[i] = reader.readLine();
            nombres[i] = chaines[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(nombres[i]);
        }


    }
}
