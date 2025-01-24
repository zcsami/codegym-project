package fr.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        String nomGrandPere = lecteur.readLine();
        Chat grandPereCat = new Chat(nomGrandPere);

        String nomGrandMere = lecteur.readLine();
        Chat grandMereChat = new Chat(nomGrandMere);

        String nomPere = lecteur.readLine();
        Chat pereChat = new Chat(nomPere, grandPereCat, null);

        String nomMere = lecteur.readLine();
        Chat mereChat = new Chat(nomMere, null, grandMereChat);

        String nomFils = lecteur.readLine();
        Chat filsChat = new Chat(nomFils, pereChat, mereChat);

        String nomFille = lecteur.readLine();
        Chat filleChat = new Chat(nomFille, pereChat, mereChat);

        System.out.println(grandPereCat);
        System.out.println(grandMereChat);
        System.out.println(pereChat);
        System.out.println(mereChat);
        System.out.println(filsChat);
        System.out.println(filleChat);
    }

    public static class Chat {
        private String nom;
        private Chat pere;
        private Chat mere;

        Chat(String nom) {
            this.nom = nom;
        }

        public Chat(String nom, Chat pere, Chat mere) {
            this.nom = nom;
            this.pere = pere;
            this.mere = mere;
        }

        @Override
        public String toString() {
            if (pere == null) {
                if (mere == null) {
                    return "Le nom du chat est " + nom + ", pas de mère, pas de père ";
                } else {
                    return "Le nom du chat est " + nom + ", " + mere.nom + " est sa mère" + ", pas de père";
                }
            } else {
                if (mere == null) {
                    return "Le nom du chat est " + nom + ", pas de mère, " + pere.nom + " est son père";
                } else {
                    return "Le nom du chat est " + nom + ", " + mere.nom + " est sa mère, " + pere.nom + " est son père";
                }
            }
        }
    }
}