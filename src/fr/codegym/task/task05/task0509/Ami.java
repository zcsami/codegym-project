package fr.codegym.task.task05.task0509;

/* 
Créer une classe Ami
*/

public class Ami {
    //écris ton code ici

    String nom;
    int age;
    char sexe;

    public void initialiser(String nom){
        this.nom = nom;
    }

    public void initialiser(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void initialiser(String nom, int age, char sexe) {
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;

    }

    public static void main(String[] args) {

    }
}
