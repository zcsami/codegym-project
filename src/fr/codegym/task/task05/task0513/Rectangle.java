package fr.codegym.task.task05.task0513;

/* 
Assemblons un rectangle
*/

public class Rectangle {
    //écris ton code ici

    int gauche;
    int sommet;
    int largeur;
    int hauteur;


    // 1
    public void initialiser(int gauche, int sommet, int largeur, int hauteur) {
        this.gauche = gauche;
        this.sommet = sommet;
        this.largeur = largeur;
        this.hauteur = hauteur;

    }

    //2
    public void initialiser(int gauche, int sommet) {
        this.gauche = gauche;
        this.sommet = sommet;
        this.largeur = 0;
        this.hauteur = 0;

    }
    //3

    public void initialiser(int gauche, int sommet, int largeur) {
        this.gauche = gauche;
        this.sommet = sommet;
        this.largeur = largeur;
        this.hauteur = largeur;
    }
    //4
    public void initialiser(int gauche) {
        this.gauche = gauche;
        this.sommet = gauche;
        this.largeur = gauche;
        this.hauteur = gauche;
    }




    public static void main(String[] args) {

    }
}
