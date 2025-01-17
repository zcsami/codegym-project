package fr.codegym.task.task04.task0434;


/* 
Table de multiplication
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int i = 1;
        int j = 1;

        while(i<=10){
            while(j<=10){
                System.out.print(i*j+" ");
                j++;
            }
            System.out.println("");
            i++;
            j=1;
        }

    }
}
