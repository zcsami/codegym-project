package fr.codegym.task.task04.task0428;

/* 
Nombre positif
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int compteur = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if(a>0) compteur++;
        int b = Integer.parseInt(reader.readLine());
        if(b>0) compteur++;
        int c = Integer.parseInt(reader.readLine());
        if(c>0) compteur++;

        System.out.println(compteur);


    }
}
