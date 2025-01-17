package fr.codegym.task.task05.task0517;

/* 
Création de chats
*/

public class Chat {
    //écris ton code ici
    String nom;
    int age;
    int poids;
    String adresse;
    String couleur;

    //6
    public Chat(String nom) {
        this.nom = nom;
        this.age = 1;
        this.poids = 1;
        this.couleur = "blanc";

    }
    //7 Nom poids age
    public Chat(String nom,  int poids, int age) {
        this.nom = nom;
        this.poids = poids;
        this.age = age;
        this.couleur = "blanc";
    }

    //8 nom age
    public Chat(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.poids = 1;
        this.couleur = "blanc";
    }

    //9 poids couleur
    public Chat(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = 1;

    }

    //poids couleur adresse
    public Chat(int poids, String couleur, String adresse) {
        this.poids = poids;
        this.couleur = couleur;
        this.adresse = adresse;
        this.age = 1;
    }


    public static void main(String[] args) {

    }
}
