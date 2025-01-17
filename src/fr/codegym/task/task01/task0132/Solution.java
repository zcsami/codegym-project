package fr.codegym.task.task01.task0132;

/* 
Somme des chiffres d'un nombre à trois chiffres
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sommeChiffresDeNombre(546));
    }

    public static int sommeChiffresDeNombre(int nombre) {
        //écris ton code ici

        int a=0, b=0, c=0;
        a = nombre / 100;
        //System.out.println(a);
        nombre = nombre - (100 * a);
        b = nombre / 10;
        //System.out.println(b);
        c = nombre - (10 * b);
        //System.out.println(c);

        return a+b+c;
    }
}