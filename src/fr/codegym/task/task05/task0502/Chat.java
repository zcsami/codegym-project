package fr.codegym.task.task05.task0502;

/* 
Implémenter la méthode combattre
*/

import static java.lang.System.exit;

public class Chat {
    public int age;
    public int poids;
    public int force;

    public Chat() {
    }

    public boolean combattre(Chat autreChat) {
        //écris ton code ici
        if (this.age - autreChat.age <0) { return false; }
        if (this.poids - autreChat.poids <-2) { return false; }
        return this.force > autreChat.force;
    }

    public static void main(String[] args) {

        String s1 = "sami";
        String s2 = "sami";

        System.out.println(s1==s2);

    }
}
