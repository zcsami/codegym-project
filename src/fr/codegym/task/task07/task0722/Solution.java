package fr.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Fin
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        //écris ton code ici
        ArrayList<String> list = new ArrayList<>();
        String s;

        while (true) {
          //on récupère la valeur
            s = lecteur.readLine();
            if (s.equals("fin")) {
                break;
            } else {
                list.add(s);
            }

        }

        for(String str : list) {
            System.out.println(str);
        }
    }
}