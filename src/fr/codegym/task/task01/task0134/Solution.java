package fr.codegym.task.task01.task0134;

/* 
Remplir une piscine avec de l'eau
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(calculVolume(25, 5, 2));
    }

    public static long calculVolume(int a, int b, int c) {
        //écris ton code ici
        return (long)a * b * c*1000;
    }
}