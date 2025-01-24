package fr.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Suppression et insertion
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //saisie des 5 chaines
        for(int i =0;i<5;i++){
            list.add(reader.readLine());
        }
        // boucle de 13
        for(int i =0;i<13;i++){
            list.add(0,list.remove(list.size()-1));
        }
        //affichage
        for(int i =0;i<list.size();i++){

        System.out.println(list.get(i));
        }
    }
}
