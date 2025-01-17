package fr.codegym.task.task05.task0510;

/* 
Initialisation de chats
*/

public class Chat {
    //écris ton code ici

    String nom;
    int age;
    int poids;
    String adresse;
    String couleur;
    // 7
    public void initialiser(String nom) {
        this.nom = nom;
        this.age = 1;
        //this.adresse = null;
        this.couleur = "blanc";
        this.poids = 1;
    }
    //8
    public void initialiser(String nom, int poids, int age) {
        this.nom = nom;
        this.age = age;
        this.poids = poids;
        this.couleur = "blanc";

    }
    //9
    public void initialiser(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.poids = 1;
        this.couleur = "blanc";

    }
    //10
    public void initialiser(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = 1;


    }
    //11
    public void initialiser(int poids, String couleur, String adresse) {
        this.poids = poids;
        this.couleur = couleur;
        //this.nom = "chat";
       this.adresse = adresse;
       this.age = 1;

    }

    public static void main(String[] args) {

    }
}
