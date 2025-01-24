package fr.codegym.task.task07.task0724;

/* 
Arbre généalogique
*/

public class Solution {
    public static void main(String[] args) {
        // écris ton code ici

        //4
        Humain h1 = new Humain("h1",true,80);
        Humain f1 = new Humain("f1",false,80);
        Humain h2 = new Humain("h2",true,80);
        Humain f2 = new Humain("f2",false,30);

        Humain E1 = new Humain("E1",false,40, h1,f2);
        Humain E2 = new Humain("E2",false,40, h1,f2);
        Humain E3 = new Humain("E3",false,40, h2,f1);
        Humain E4 = new Humain("E4",false,40, h2,f1);
        Humain E5 = new Humain("E5",false,40, h2,f1);

        System.out.println(h1);
        System.out.println(f1);
        System.out.println(h2);
        System.out.println(f2);
        System.out.println(E1);
        System.out.println(E2);
        System.out.println(E3);
        System.out.println(E4);
        System.out.println(E5);


    }

    public static class Humain {
        // écris ton code ici
        String nom;
        boolean sexe;
        int age;
        Humain pere;
        Humain mere;

        //Constructeurs:


        public Humain(String nom, boolean sexe, int age) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
        }

        public Humain(String nom, boolean sexe, int age, Humain pere, Humain mere) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
            this.pere = pere;
            this.mere = mere;
        }
    @Override
        public String toString() {
            String texte = "";
            texte += "Nom : " + this.nom;
            texte += ", sexe : " + (this.sexe ? "masculin" : "féminin");
            texte += ", âge : " + this.age;

            if (this.pere != null) {
                texte += ", père : " + this.pere.nom;
            }

            if (this.mere != null) {
                texte += ", mère : " + this.mere.nom;
            }

            return texte;
        }
    }
}