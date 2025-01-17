package fr.codegym.task.task05.task0507;

/* 
Moyenne arithmétique
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici

        Scanner scanner = new Scanner(System.in);
        int somme = 0;
        int compteur = 0;
        while(true) {
            int a = scanner.nextInt();
            if (a ==-1){ break; }
            somme = somme + a;
            compteur++;
        }
        System.out.println((double)somme/compteur);

    }
}

