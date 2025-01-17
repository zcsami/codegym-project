package fr.codegym.task.task04.task0423;

/* 
Politique du videur
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if(age>20){
            System.out.println("18 ans, c'est déjà assez vieux");
        }
    }
}
