package fr.codegym.task.task08.task0819;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Ensemble de chats
*/

public class Solution {
    public static void main(String[] args) {
        Set<Chat> chats = creerChats();

        //écris ton code ici. Étape 3
        imprimerChats(chats);

        ArrayList<Chat> list = new ArrayList<>(chats);
        chats.remove(list.get(0));
        //imprimerChats(chats);
    }

    public static Set<Chat> creerChats() {
        //écris ton code ici. Étape 2
        Set<Chat> chats = new HashSet<>();
        chats.add(new Chat());
        chats.add(new Chat());
        chats.add(new Chat());
        return chats;
    }

    public static void imprimerChats(Set<Chat> chats) {
        // Étape 4
        for (Chat chat : chats) {
            System.out.println(chat);
        }
    }

    // Étape 1

    public static class Chat {

    }
}
