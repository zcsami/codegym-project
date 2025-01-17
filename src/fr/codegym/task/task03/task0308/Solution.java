package fr.codegym.task.task03.task0308;

/* 
Produit de 10 nombres
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici

        int resultat =1, i =1;


        while (i <= 10) {
            resultat = resultat * i;
            i++;
        }

        System.out.println(resultat);
    }
}
