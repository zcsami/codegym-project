package fr.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Jouons à Javarella
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> liste = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int a = Integer.parseInt(bis.readLine());
            liste.add(a);
        }

        ArrayList<Integer> c3 = new ArrayList<>();
        ArrayList<Integer> c2 = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int x = liste.get(i);

            if ((x % 3 == 0) || (x % 2 == 0)) {
                if (x % 3 == 0) {
                    c3.add(x);
                }
                if (x % 2 == 0) {
                    c2.add(x);
                }
            } else {
                c.add(x);
            }
        }

        imprimerListe(c3);
        imprimerListe(c2);
        imprimerListe(c);
    }

    public static void imprimerListe(List<Integer> liste) {
        for (Integer x : liste) {
            System.out.println(x);
        }
    }
}
