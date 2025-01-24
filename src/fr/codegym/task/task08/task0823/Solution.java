package fr.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Expansion nationale
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        String s = lecteur.readLine();

        //écris ton code ici
       char[] chars = s.toCharArray();
       chars[0] = Character.toUpperCase(chars[0]);
       for (int i = 1; i < chars.length; i++) {
           if(chars[i-1] == ' ' ) {
               chars[i] = Character.toUpperCase(chars[i]);
           }
       }
        System.out.println(chars);
    }
}
