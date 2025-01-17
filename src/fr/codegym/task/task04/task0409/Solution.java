package fr.codegym.task.task04.task0409;

/* 
Le plus proche de 10
*/

public class Solution {
    public static void main(String[] args) {
        afficherPlusProcheDeDix(8, 11);
        afficherPlusProcheDeDix(7, 14);
    }

    public static void afficherPlusProcheDeDix(int a, int b) {
        // écris ton code ici
        int diffA = abs(10-a);
        int diffB = abs(10-b);

        if (diffA == diffB) {
            System.out.println(a);
        } else if (diffA  < diffB) { System.out.println( a );
        } else { System.out.println( b );}

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}