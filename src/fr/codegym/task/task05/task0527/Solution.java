package fr.codegym.task.task05.task0527;

/* 
Tom et Jerry
*/

public class Solution {
    public static void main(String[] args) {
        Souris jerrySouris = new Souris("Jerry", 12, 5) ;

        //écris ton code ici
        Souris kateSouris = new Souris("Kate", 12, 5) ;
        Chien chien1 = new Chien("Chien", 12, 5) ;
        Chat chat1 = new Chat("Blue", 12, 5) ;
    }

    public static class Souris {
        String nom;
        int taille;
        int queue;

        public Souris(String nom, int taille, int queue) {
            this.nom = nom;
            this.taille = taille;
            this.queue = queue;
        }
    }



    //écris ton code ici
    public static class Chien {
        String nom;
        int taille;
        int poids;

        public Chien(String nom, int taille, int poids) {
            this.nom = nom;
            this.taille = taille;
            this.poids = poids;
        }
    }
    public static class Chat{
        String nom;
        int poids;
        int age;
        public Chat(String nom, int poids, int age) {
            this.nom = nom;
            this.poids = poids;
            this.age = age;
        }

    }
}
