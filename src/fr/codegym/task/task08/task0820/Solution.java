package fr.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Ensemble d'animaux
*/

public class Solution {
    public static void main(String[] args) {
        Set<Chat> chats = creerChats();
        Set<Chien> chiens = creerChiens();
        //
        System.out.printf("%d %s %s\n", chats.size(), chiens.size(), chiens.size());

        Set<Object> animaux = jointure(chats, chiens);
        imprimerAnimaux(animaux);

        supprimerChats(animaux, chats);
        imprimerAnimaux(animaux);
    }

    public static Set<Chat> creerChats() {
        HashSet<Chat> resultat = new HashSet<Chat>();

        //écris ton code ici
        resultat.add(new Chat());
        resultat.add(new Chat());
        resultat.add(new Chat());
        resultat.add(new Chat());
        return resultat;
    }

    public static Set<Chien> creerChiens() {
        //écris ton code ici
        HashSet<Chien> resultat = new HashSet<Chien>();
        resultat.add(new Chien());
        resultat.add(new Chien());
        resultat.add(new Chien());
        return resultat;
    }

    public static Set<Object> jointure(Set<Chat> chats, Set<Chien> chiens) {

        //écris ton code ici
        HashSet<Object> animaux = new HashSet<>();
        animaux.addAll(chats);
        animaux.addAll(chiens);
        return animaux;
    }

    public static void supprimerChats(Set<Object> animaux, Set<Chat> chats) {
        //écris ton code ici
        animaux.removeAll(chats);
    }

    public static void imprimerAnimaux(Set<Object> animaux) {
        //écris ton code ici
        for (Object o : animaux) {
            System.out.println(o);
        }
    }

    //écris ton code ici

    public static class Chat {

    }
    public static class Chien {

    }
}
