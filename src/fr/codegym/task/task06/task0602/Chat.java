package fr.codegym.task.task06.task0602;

/* 
Chats zombies, chiens zombies
*/

public class Chat {
    public static void main(String[] args) {

    }

    //écris ton code ici
    protected void finalize() throws Throwable {
        System.out.println("Un Chat a été détruit");
    }

}

class Chien {
    //écris ton code ici
    protected void finalize() throws Throwable {
        System.out.println("Un Chien a été détruit");
    }
}
