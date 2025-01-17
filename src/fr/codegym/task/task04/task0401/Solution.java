package fr.codegym.task.task04.task0401;

/* 
Cet âge me va si mal...
*/

public class Solution {
    public static void main(String[] args) {

        Personne personne = new Personne();
        System.out.println("Âge : " + personne.age);
        personne.ajusterAge(personne.age);
        System.out.println("Âge ajusté : " + personne.age);
    }

    public static class Personne {
        public int age = 20;

        public void ajusterAge(int age) {
            this.age = age + 20;
            System.out.println("L'âge dans ajusterAge() est " + age);
        }
    }
}
