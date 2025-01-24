package fr.codegym.task.task08.task0824;

/* 
Créons une famille
*/

import java.util.ArrayList;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Humain enfant1 = new Humain("E1",true,3);
        Humain enfant2 = new Humain("E2",false,4);
        Humain enfant3 = new Humain("E3",false,5);
        ArrayList<Humain> les3enfants = new ArrayList<>();
        les3enfants.add(enfant1);
        les3enfants.add(enfant2);
        les3enfants.add(enfant3);

        Humain mere = new Humain("M",false,30,les3enfants);
        Humain pere = new Humain("P",true,30,les3enfants);
        Humain grandPereM = new Humain("GPM",true,60, mere);
        Humain grandPereP = new Humain("GPP",true,60, pere);

        Humain grandMereM = new Humain("GMM",false,60, mere);
        Humain grandMereP = new Humain("GMP",false,60, pere);


        System.out.println(grandPereM);
        System.out.println(grandPereP);
        System.out.println(grandMereM);
        System.out.println(grandMereP);
        System.out.println(pere);
        System.out.println(mere);
        System.out.println(enfant1);
        System.out.println(enfant2);
        System.out.println(enfant3);



    }

    public static class Humain {
        //écris ton code ici
        String nom;
        boolean sexe;
        int age;
        ArrayList<Humain> enfants = new ArrayList<>();
        //constructeur normal

    public Humain(String nom, boolean sexe, int age) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
    }

    //constructeur avec enfants
        public Humain(String nom, boolean sexe, int age, ArrayList<Humain> enfants  ) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
        this.enfants = enfants;
        }

        //constructeur avec un enfant
        public Humain(String nom, boolean sexe, int age, Humain enfant) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
        enfants.add(enfant);
        }
        public String toString() {
            String texte = "";
            texte += "Nom : " + this.nom;
            texte += ", sexe : " + (this.sexe ? "masculin" : "féminin");
            texte += ", âge : " + this.age;

            int nombreEnfants = this.enfants.size();
            if (nombreEnfants > 0) {
                texte += ", enfants : " + this.enfants.get(0).nom;

                for (int i = 1; i < nombreEnfants; i++) {
                    Humain enfant = this.enfants.get(i);
                    texte += ", " + enfant.nom;
                }
            }
            return texte;
        }
    }

}
