package fr.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Mots inversés
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        //on saisi
        for(int i=0; i<5;i++){
            list.add(reader.readLine());
        }
        list.remove(2);

        int taille = list.size();
        for(int i= taille -1 ; i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}


