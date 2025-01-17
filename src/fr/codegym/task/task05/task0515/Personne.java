package fr.codegym.task.task05.task0515;

/* 
Initialisation d'objets
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Personne {
    String nom;
    char sexe;
    int argent;
    int poids;
    double taille;


    public void initialiser(String nom, int argent, char sexe, int poids, double taille) {
        this.nom = nom;
        this.argent = argent;
        this.sexe = sexe;
        this.poids = 70;
        this.taille = 1.7;
    }

    public static void main(String[] args) {



    }
}
