package fr.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Chats static
*/

public class Chat {
    //écris ton code ici
    public static ArrayList<Chat> chats = new ArrayList<>();

    public Chat() {
    }

    public static void main(String[] args) {
        //écris ton code ici
        Chat chat1 = new Chat();
        chats.add(chat1);
        Chat chat2 = new Chat();
        chats.add(chat2);
        Chat chat3 = new Chat();
        chats.add(chat3);
        Chat chat4 = new Chat();
        chats.add(chat4);
        Chat chat5 = new Chat();
        chats.add(chat5);
        Chat chat6 = new Chat();
        chats.add(chat6);
        Chat chat7 = new Chat();
        chats.add(chat7);
        Chat chat8 = new Chat();
        chats.add(chat8);
        Chat chat9 = new Chat();
        chats.add(chat9);
        Chat chat10 = new Chat();
        chats.add(chat10);
        imprimerChats();
    }

    public static void imprimerChats() {
        //écris ton code ici
        for (Chat chat : chats) {
            System.out.println(chat);
        }
    }
}
