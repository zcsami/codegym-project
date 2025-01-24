package fr.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Mission sur les algorithmes
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> liste = new ArrayList<String>();
        while (true) {
            String s = lecteur.readLine();
            if (s.isEmpty()) {
                break;
            }
            liste.add(s);
        }

        String[] tableau = liste.toArray(new String[liste.size()]);
        tri(tableau);

        for (String x : tableau) {
            System.out.println(x);
        }
    }

    public static void tri(String[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                if (estUnNombre(tableau[i]) && estUnNombre(tableau[j])) {
                    if (Integer.parseInt(tableau[i]) < Integer.parseInt(tableau[j])) {
                        String temp = tableau[i];
                        tableau[i] = tableau[j];
                        tableau[j] = temp;
                    }
                } else if (!estUnNombre(tableau[i]) && !estUnNombre(tableau[j])) {
                    if (estSuperieurA(tableau[i], tableau[j])) {
                        String temp = tableau[i];
                        tableau[i] = tableau[j];
                        tableau[j] = temp;
                    }
                }
            }
        }
    }

    // Méthode de comparaison de chaînes : 'a' est supérieur à 'b'
    public static boolean estSuperieurA(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // La chaîne passée est-elle est un nombre ?
    public static boolean estUnNombre(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i != 0 && c == '-') { // La chaîne contient un trait d'union
                return false;
            }
            if (!Character.isDigit(c) && c != '-') { // ou n'est pas un nombre et ne commence pas par un trait d'union
                return false;
            }
            if (i == 0 && c == '-' && chars.length == 1) { // ou est seulement un trait d'union
                return false;
            }
        }
        return true;
    }

}
