package fr.codegym.task.task06.task0604;

/* 
Compteur de chats
*/

public class Chat {
    public static int nombreChats = 0;

    //écris ton code ici
    public Chat(){
        nombreChats++;
    }

    protected void finalize() throws Throwable{
        nombreChats--;

    }

    public static void main(String[] args) {

    }
}