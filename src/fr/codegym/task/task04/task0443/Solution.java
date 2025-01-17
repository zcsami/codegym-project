package fr.codegym.task.task04.task0443;


/* 
Un nom est un nom
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nom= reader.readLine();
        int annee = Integer.parseInt(reader.readLine());
        int mois = Integer.parseInt(reader.readLine());
        int jour = Integer.parseInt(reader.readLine());

        System.out.println("Je m'appelle "+nom+".");
        System.out.println( "Ma date de naissance est le "+ jour+"/"+mois+"/"+annee);
    }
}
