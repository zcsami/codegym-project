package fr.codegym.task.task09.task0920;

/* 
Compte à rebours
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            //écris ton code ici
        }
    }
}
