package fr.codegym.task.task04.task0407;

/* 
Les chats dans l'univers
*/

public class Solution {
    public static void main(String[] args) {
        Chat chat1 = new Chat();
        //écris ton code ici
        Chat.total++;

        Chat chat2 = new Chat();
        //écris ton code ici
        Chat.total++;

        System.out.println("Le nombre de chats est " + Chat.total);
    }

    public static class Chat {
        public static int total = 0;
    }
}