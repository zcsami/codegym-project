package fr.codegym.task.task04.task0427;

/* 
Description de nombres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        boolean pair = (number % 2 == 0);
        String numberString = String.valueOf(number);
        int longueur = numberString.length();

        if(number>=1 && number <=999) {
            if (longueur == 1 && pair) {
                System.out.println("Nombre pair à un chiffre");
            }
            if (longueur == 1 && !pair) {
                System.out.println("Nombre impair à un chiffre");
            }

            if (longueur == 2 && pair) {
                System.out.println("Nombre pair à deux chiffres");
            }
            if (longueur == 2 && !pair) {
                System.out.println("Nombre impair à deux chiffres");
            }
            if (longueur == 3 && pair) {
                System.out.println("Nombre pair à trois chiffres");
            }
            if (longueur == 3 && !pair) {
                System.out.println("Nombre impair à trois chiffres");
            }
        }



    }
}
