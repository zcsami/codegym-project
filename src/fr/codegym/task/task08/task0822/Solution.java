package fr.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Le plus petit de N nombres
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> listeEntiers = obtenirListeEntiers();
        System.out.println(obtenirMinimum(listeEntiers));
    }

    public static int obtenirMinimum(List<Integer> tableau) {
        // Trouve le minimum ici
        int min = tableau.get(0);
        for (int i = 1; i < tableau.size(); i++) {
            if (tableau.get(i) < min) {
                min = tableau.get(i);
            }
        }
        return min;
    }

    public static List<Integer> obtenirListeEntiers() throws IOException {
        // Crée et initialise une liste ici
        ArrayList<Integer> listeEntiers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            listeEntiers.add(Integer.parseInt(reader.readLine()));
        }

        return listeEntiers;
    }
}
