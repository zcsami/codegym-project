package fr.codegym.task.task04.task0432;



/* 
Il ne saurait y avoir d'excès de bonnes choses
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int compteur = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chaine = reader.readLine();
        int rep = Integer.parseInt(reader.readLine());
        while(compteur < rep) {
            System.out.println(chaine);
            compteur++;
        }



    }
}
