package fr.codegym.task.task09.task0929;

import java.io.*;

/* 
Modifions le code pour qu'il fasse quelque chose d'utile !
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        String nomFichierSource = lecteur.readLine();

        InputStream fileInputStream = null;
        try {
            fileInputStream = obtenirInputStream(nomFichierSource);
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'existe pas.");
            nomFichierSource = lecteur.readLine();
            fileInputStream = obtenirInputStream(nomFichierSource);
        }

        String nomFichierDestination = lecteur.readLine();
        OutputStream fileOutputStream = obtenirOutputStream(nomFichierDestination);

        while (fileInputStream.available() > 0) {
            int donnees = fileInputStream.read();
            fileOutputStream.write(donnees);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream obtenirInputStream(String nomFichier) throws IOException {
        return new FileInputStream(nomFichier);
    }

    public static OutputStream obtenirOutputStream(String nomFichier) throws IOException {
        return new FileOutputStream(nomFichier);
    }
}
