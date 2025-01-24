package fr.codegym.task.task07.task0720;

import java.io.*;
import java.util.ArrayList;

/* 
Mélange en temps opportun
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        //écris ton code ici
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        // saisie n et m
        int n = Integer.parseInt(lecteur.readLine());
        int m = Integer.parseInt(lecteur.readLine());

        //n chaines
        for (int i = 0; i < n; i++) {
            list.add(lecteur.readLine());
        }
        // on rajoute à la fin
        for (int i = 0; i < m; i++) {
            list.add(list.get(0));
            list.remove(0);
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
