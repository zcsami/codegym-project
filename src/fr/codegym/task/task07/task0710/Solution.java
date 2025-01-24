package fr.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Direction le sommet de la liste
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String[] tableau = new String[10];

        for (int i =0;i<10;i++){
           tableau[i] = reader.readLine();
        }
        for(int i = tableau.length-1;i>=0;i--){
            list.add(tableau[i]);
        }
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
