package fr.codegym.task.task06.task0620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Réparer les erreurs de la jeunesse
*/

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String phrase = "Le plus grand nombre est ";

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max = a > b ? a : b;

        System.out.println(phrase + max);
    }

}
