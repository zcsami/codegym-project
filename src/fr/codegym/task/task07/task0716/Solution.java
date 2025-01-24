package fr.codegym.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
R ou L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String m1 = "rose";
        String m2 = "lyre";
        String m3 = "love";

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> liste = new ArrayList<String>();
        liste.add(m1); //0
        liste.add(m2); //1
        liste.add(m3); //2
        liste = corriger(liste);

        for (String s : liste) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> corriger(ArrayList<String> liste) {
        ArrayList<String> resultat = new ArrayList<>();

        for (String s : liste) {
            boolean contientR = s.contains("r");
            boolean contientL = s.contains("l");

            if (contientR && !contientL) {
                // Supprimer les mots contenant "r" mais pas "l"
                continue;
            } else if (contientL && !contientR) {
                // Dupliquer les mots contenant "l" mais pas "r"
                resultat.add(s);
                resultat.add(s);
            } else {
                // Ajouter les autres mots (inchangés)
                resultat.add(s);
            }
        }

        return resultat;
    }

}
