package fr.codegym.task.task04.task0442;


/* 
Ajout
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int somme = 0;
        while(true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) {
                somme =somme -1;
                System.out.println(somme);
                break;
            } else {somme += number;}
        }
    }
}
