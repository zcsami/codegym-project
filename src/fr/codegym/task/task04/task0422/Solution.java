package fr.codegym.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nom = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age < 18) {
            System.out.println("Grandis encore un peu");
        }
    }
}
