package fr.codegym.task.task03.task0319;

/* 
Prédictions
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nom = reader.readLine();
        int nombre1 = Integer.parseInt(reader.readLine());
        int nombre2 = Integer.parseInt(reader.readLine());
        System.out.println(nom +" gagnera "+nombre1+" dans "+nombre2+ " ans.");
    }
}
