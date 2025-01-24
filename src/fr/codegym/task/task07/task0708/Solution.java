package fr.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
La chaîne la plus longue
*/

public class Solution {
    private static List<String> chaines;

    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        chaines = new ArrayList<>();
        int max = 0;
        int indice = 0;
        for(int i= 0; i<5;i++){
            chaines.add(reader.readLine());
            if (chaines.get(i).length() > max){
                max = chaines.get(i).length();
            }

        }
        for (int i = 0; i < chaines.size(); i++) {
            if (chaines.get(i).length() == max){
                System.out.println(chaines.get(i));
            }
        }
    }
}
