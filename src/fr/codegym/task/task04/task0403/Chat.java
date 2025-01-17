package fr.codegym.task.task04.task0403;

/* 
Quel est le nom du chat ?
*/

public class Chat {
    private String nom = "Chat sans nom";

    public void definirNom(String nom) {
        //écris ton code ici
        this.nom = nom;
    }

    public static void main(String[] args) {
        Chat chat = new Chat();
        chat.definirNom("Félix");
        System.out.println(chat.nom);
    }
}
