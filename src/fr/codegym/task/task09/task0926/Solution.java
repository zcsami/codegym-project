package fr.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
Liste de tableaux de nombres
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> liste = creerListe();
        imprimerListe(liste);
    }

    public static ArrayList<int[]> creerListe() {
        //écris ton code ici
        ArrayList<int[]> liste = new ArrayList<>();
        liste.add(new int[]{1, 2, 3,4,5});
        liste.add(new int[]{1,2});
        liste.add(new int[]{1,2,3,4});
        liste.add(new int[]{1,2,3,4,5,6,7});
        liste.add(new int[0]);
        return liste;
    }

    public static void imprimerListe(ArrayList<int[]> liste) {
        for (int[] tableau : liste) {
            for (int x : tableau) {
                System.out.println(x);
            }
            //System.out.println();
        }
    }
}
