package fr.codegym.task.task03.task0322;


/* 
Amour pur et profond
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nom1, nom2, nom3;
        nom1 = reader.readLine();
        nom2 = reader.readLine();
        nom3 = reader.readLine();

        System.out.println(nom1 + " + " +   nom2 + " + " + " " + nom3 +" = Amour pur. Oh là là !");

    }
}