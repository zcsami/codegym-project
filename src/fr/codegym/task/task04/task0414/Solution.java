package fr.codegym.task.task04.task0414;

/* 
Nombre de jours dans l’année
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici

            Scanner scanner = new Scanner(System.in);
            int annee = scanner.nextInt();

            int x = 0;
            if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                x = 366;
            } else {
                x = 365;
            }

        System.out.println("Nombre de jours dans l'année : "+ x);

    }
}