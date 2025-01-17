package fr.codegym.task.task05.task0504;


/* 
Les trois « Miaousquetaires »
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Chat chat1 = new Chat("blue",8,8,10);
        Chat chat2 = new Chat("red",8,8,10);
        Chat chat3 = new Chat("green",8,8,10);
    }

    public static class Chat {
        private String nom;
        private int age;
        private int poids;
        private int force;

        public Chat(String nom, int age, int poids, int force) {
            this.nom = nom;
            this.age = age;
            this.poids= poids;
            this.force = force;
        }
    }
}