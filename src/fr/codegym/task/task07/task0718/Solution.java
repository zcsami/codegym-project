package fr.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Vérification d'ordre
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> liste = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = lecteur.readLine();
            liste.add(s);
        }

        String minElement = liste.get(0);

        for (int i = 1; i < 10; i++) {
            if (liste.get(i).length() >= minElement.length()) {
                minElement = liste.get(i);
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}
