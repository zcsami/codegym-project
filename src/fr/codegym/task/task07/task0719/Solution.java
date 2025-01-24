package fr.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Afficher des nombres en ordre inverse
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        //écris ton code ici
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(Integer.parseInt(file.readLine()));
        }
        for (int i = list.size()-1; i >=0; i--) {
            System.out.println(list.get(i));

        }

    }
}
