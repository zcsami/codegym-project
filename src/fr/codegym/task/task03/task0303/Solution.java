package fr.codegym.task.task03.task0303;

/* 
Change de devises
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        System.out.println(conversionEurEnUsd(10,1.1));
        System.out.println(conversionEurEnUsd(10,1.2));
    }

    public static double conversionEurEnUsd(int eur, double tauxChange) {
        //écris ton code ici
        return eur * tauxChange;
    }
}

