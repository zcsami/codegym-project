package fr.codegym.task.task04.task0426;

/* 
Étiquettes et nombres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        // Nombre pair négatif
        if(number % 2 == 0 && number < 0) {
            System.out.println( "Nombre pair négatif");
        }

        // Nombre impair négatif
        if(number % 2 != 0 && number < 0) {
            System.out.println( "Nombre impair négatif");
        }

        //Nombre pair positif
        if(number % 2 == 0 && number > 0) {
            System.out.println( "Nombre pair positif");
        }

        //Nombre impaire positif
        if(number % 2 != 0 && number > 0) {
            System.out.println( "Nombre impair positif");
        }
        if(number == 0 ) {
            System.out.println("Zéro");
        }

    }
}
