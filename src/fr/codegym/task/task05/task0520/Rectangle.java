package fr.codegym.task.task05.task0520;

/* 
Créer une classe Rectangle
*/


public class Rectangle {
    //écris ton code ici
    int gauche;
    int sommet;
    int largeur;
    int hauteur;

    public Rectangle(int gauche, int sommet, int largeur, int hauteur) {
        this.gauche = gauche;
        this.sommet = sommet;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Rectangle(int gauche, int sommet) {
        this.gauche = gauche;
        this.sommet = sommet;
        this.largeur = 0;
        this.hauteur = 0;
    }

    public Rectangle(int largeur) {
        this.largeur = largeur;
        this.hauteur = largeur;
    }

    public Rectangle(Rectangle rectangle) {
        this.gauche = rectangle.gauche;
        this.sommet = rectangle.sommet;
        this.largeur = rectangle.largeur;
        this.hauteur = rectangle.hauteur;

    }

    public static void main(String[] args) {

    }
}
