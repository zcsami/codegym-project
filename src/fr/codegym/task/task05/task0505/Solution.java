package fr.codegym.task.task05.task0505;

/* 
Carnage félin
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Chat chat1 = new Chat("Blue",9,9,10);
        Chat chat2 = new Chat("Red",1,1,9);
        Chat chat3 = new Chat("Yellow",6,9,8);

        System.out.println(chat1.combattre(chat2));
        System.out.println(chat1.combattre(chat3));
        System.out.println(chat2.combattre(chat3));

    }

    public static class Chat {
        protected String nom;
        protected int age;
        protected int poids;
        protected int force;

        public Chat(String nom, int age, int poids, int force) {
            this.nom = nom;
            this.age = age;
            this.poids= poids;
            this.force = force;
        }

        public boolean combattre(Chat autreChat) {
            int avantageAge = this.age > autreChat.age ? 1 : 0;
            int avantagePoids = this.poids > autreChat.poids ? 1 : 0;
            int avantageForce = this.force > autreChat.force ? 1 : 0;

            int score = avantageAge + avantagePoids + avantageForce;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
