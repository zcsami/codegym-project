package fr.codegym.task.task07.task0723;

/* 
Compte à rebours
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            //écris ton code ici
            Thread.sleep(100);
        }

        System.out.println("Boum !");
    }
}
