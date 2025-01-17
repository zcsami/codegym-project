package fr.codegym.task.task03.task0314;

/* 
Table de multiplication
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici

        for (int i = 1; i <=10; i++) {
            for (int j=1; j<=10; j++){
                System.out.print(i* j+" ");
                if (j==10){
                    System.out.println(" ");
                }
            }
        }
    }
}
