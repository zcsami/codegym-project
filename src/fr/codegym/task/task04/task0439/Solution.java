package fr.codegym.task.task04.task0439;

/* 
Chaîne de lettres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nom = reader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(nom+ " m'aime.");
        }

    }
}
