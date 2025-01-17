package fr.codegym.task.task04.task0411;

/* 
Saisons sur Terre
*/

public class Solution {
    public static void main(String[] args) {
        verifierSaison(12);
        verifierSaison(4);
        verifierSaison(7);
        verifierSaison(10);
    }

    public static void verifierSaison(int mois) {
        //écris ton code ici
        switch (mois) {
            case 12:
            case 1:
            case 2:
                System.out.println("hiver");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("printemps");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("été");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("automne");
                break;

           default:
               System.out.println("impossible");




        }
    }
}