package fr.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Un grand tableau et deux petits
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int[] nombres = new int[20];
        int[] tableau1 = new int[10];
        int[] tableau2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < nombres.length; i++) {
            if (i < 10) {
                tableau1[i] = nombres[i];
            } else {
                tableau2[Math.abs(10-i)] = nombres[i];
            }
        }
        for (int i = 0; i < tableau2.length; i++) {
            System.out.println(tableau2[i]);
        }
    }
}


