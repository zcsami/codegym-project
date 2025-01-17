package fr.codegym.task.task03.task0312;

/* 
Conversion de temps
*/

public class Solution {
    //écris ton code ici

    public static void main(String[] args) {
        //écris ton code ici

        System.out.println(conversionEnSecondes(1));
        System.out.println(conversionEnSecondes(2));
    }

    public static int conversionEnSecondes(int heures){

        return heures * 3600;
    }
}
