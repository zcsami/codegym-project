package fr.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Voyelles et consonnes
*/

public class Solution {
    public static char[] voyelles = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

    public static void main(String[] args) throws Exception {
        // Lire la chaîne au clavier
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chaine = reader.readLine();
        char[] chaineTableau = chaine.toCharArray();

        // Initialisation des chaînes pour voyelles et consonnes
        String chaineVoyelle = "";
        String chaineConsonnes = "";

        // Parcourir chaque caractère de la chaîne
        for (char c : chaineTableau) {
            if (estVoyelle(c)) {
                // Ajouter les voyelles
                chaineVoyelle += c + " ";
            } else if (!Character.isWhitespace(c)) {
                // Ajouter les consonnes et signes de ponctuation, mais pas les espaces
                chaineConsonnes += c + " ";
            }
        }

        // Afficher les voyelles et les consonnes
        System.out.println(chaineVoyelle);
        System.out.println(chaineConsonnes);
    }

    // Vérifie si un caractère est une voyelle
    public static boolean estVoyelle(char c) {
        c = Character.toLowerCase(c); // Convertir en minuscule
        for (char d : voyelles) {     // Vérifier si c est une voyelle
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
