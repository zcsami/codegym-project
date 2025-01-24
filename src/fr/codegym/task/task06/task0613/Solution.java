package fr.codegym.task.task06.task0613;

/* 
Chat et static
*/

public class Solution {
    public static void main(String[] args) {
        // Crée 10 chats
        Chat chat1 = new Chat();
        Chat chat2 = new Chat();
        Chat chat3 = new Chat();
        Chat chat4 = new Chat();
        Chat chat5 = new Chat();
        Chat chat6 = new Chat();
        Chat chat7 = new Chat();
        Chat chat8 = new Chat();
        Chat chat9 = new Chat();
        Chat chat10 = new Chat();

        // Affiche la valeur de la variable nombreChats

        System.out.println(Chat.nombreChats);
    }

    public static class Chat {
        // Crée une variable static nombreChats
        public static int nombreChats;

        // Déclare un constructeur
        public Chat(){
            Chat.nombreChats++;
        }
    }
}
