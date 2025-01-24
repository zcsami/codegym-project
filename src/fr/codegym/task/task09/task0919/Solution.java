package fr.codegym.task.task09.task0919;

/* 
Division par zéro
*/

public class Solution {

    public static void main(String[] args) {
        try {
            diviserParZero();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void diviserParZero()  {

        System.out.println(9/0);


    }
}
