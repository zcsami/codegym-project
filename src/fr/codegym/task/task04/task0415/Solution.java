package fr.codegym.task.task04.task0415;

/* 
La règle du triangle
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean ok = true;

        // on compare
        // Vérifier si un triangle est possible
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Le triangle est possible.");
        } else {
            System.out.println("Le triangle n'est pas possible.");
        }
    }
}