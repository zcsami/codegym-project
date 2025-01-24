package fr.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Tableau de chaînes en ordre inverse
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        String[] tableau  = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            tableau[i] = reader.readLine();
        }

        for(int i=9;i>=0;i--){
            System.out.println(tableau[i]);
        }
    }
}