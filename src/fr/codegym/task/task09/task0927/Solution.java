package fr.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Dix chats
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Chat> map = creerMap();
        Set<Chat> ensemble = convertirMapEnSet(map);
        imprimerSetChats(ensemble);
    }

    public static Map<String, Chat> creerMap() {
        //écris ton code ici
        Map<String, Chat> map = new HashMap<>();
        Chat chat1 = new Chat("chat 1");
        Chat chat2 = new Chat("chat 2");
        Chat chat3 = new Chat("chat 3");
        Chat chat4 = new Chat("chat 4");
        Chat chat5 = new Chat("chat 5");
        Chat chat6 = new Chat("chat 6");
        Chat chat7 = new Chat("chat 7");
        Chat chat8 = new Chat("chat 8");
        Chat chat9 = new Chat("chat 9");
        Chat chat10 = new Chat("chat 10");
        map.put("chat 1", chat1);
        map.put("chat 2", chat2);
        map.put("chat 3", chat3);
        map.put("chat 4", chat4);
        map.put("chat 5", chat5);
        map.put("chat 6", chat6);
        map.put("chat 7", chat7);
        map.put("chat 8", chat8);
        map.put("chat 9", chat9);
        map.put("chat 10", chat10);
        return map;
    }

    public static Set<Chat> convertirMapEnSet(Map<String, Chat> map) {
        //écris ton code ici
        Set<Chat> chats = new HashSet<>();
        for (Map.Entry<String, Chat> entry : map.entrySet()) {
            chats.add(entry.getValue());
        }
        return chats;
    }

    public static void imprimerSetChats(Set<Chat> ensemble) {
        for (Chat chat : ensemble) {
            System.out.println(chat);
        }
    }

    public static class Chat {
        private String nom;

        public Chat(String nom) {
            this.nom = nom;
        }

        public String toString() {
            return "Chat " + this.nom;
        }
    }


}
