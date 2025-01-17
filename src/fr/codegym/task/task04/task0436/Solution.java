package fr.codegym.task.task04.task0436;


/* 
Dessin d'un rectangle
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());


        for(int j = 0; j < m; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(8);
            }
            System.out.println("");

        }

    }
}
