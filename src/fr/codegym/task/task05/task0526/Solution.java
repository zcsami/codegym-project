package fr.codegym.task.task05.task0526;

/* 
Hommes et femmes
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Homme homme1 = new Homme("sami",39,"adresse");
        Homme homme2 = new Homme("sami2",39,"adresse");

        Femme femme1 = new Femme("femme",39,"adresse");
        Femme femme2 = new Femme("femme2",39,"adresse");

        System.out.println(homme1);
        System.out.println(homme2);
        System.out.println(femme1);
        System.out.println(femme2);
    }

    //écris ton code ici

    public static class Homme{
        String nom;
        int age;
        String adresse;

        public Homme(String nom, int age, String adresse) {
            this.nom = nom;
            this.age = age;
            this.adresse = adresse;
        }

        public String toString(){ return nom + " " + age + " " + adresse; }
    }

    public static class Femme{
        String nom;
        int age;
        String adresse;

        public Femme(String nom, int age, String adresse) {
            this.nom = nom;
            this.age = age;
            this.adresse = adresse;
        }
        public String toString(){ return nom + " " + age + " " + adresse; }

    }
}
