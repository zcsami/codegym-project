package fr.codegym.task.task05.task0522;

/* 
Le maximum de constructeurs
*/

public class Cercle {
    public double x;
    public double y;
    public double rayon;

    //écris ton code ici
    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }
    public Cercle() {
        this(0.0, 0.0, 0.0);

    }

    public Cercle(double y, double rayon) {
        this.y = y;
        this.rayon = rayon;
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }


    public static void main(String[] args) {

    }
}