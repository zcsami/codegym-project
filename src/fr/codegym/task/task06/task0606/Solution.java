package fr.codegym.task.task06.task0606;

import java.io.*;

/* 
Chiffres pairs et impairs
*/

public class Solution {

    public static int pair;
    public static int impair;

    public static void main(String[] args) throws IOException {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nombre = Integer.parseInt(reader.readLine());
        String chaine = String.valueOf(nombre);
        int longueur = chaine.length();
        int valeur=0;


        for (int i = 0; i < longueur; i++) {
            valeur = Character.getNumericValue(chaine.charAt(i));
            if(valeur%2==0){
                pair++;
            } else {
                impair++;
            }

        }
        System.out.println("Pair : " + pair+" Impair : " + impair);
    }
}
