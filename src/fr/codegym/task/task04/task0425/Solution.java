package fr.codegym.task.task04.task0425;

/* 
Cible verrouillée !
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if(a>0 && b>0){System.out.println(1);}
        if(a<0 && b>0){System.out.println(2);}
        if(a<0 && b<0){System.out.println(3);}
        if(a>0 && b<0){System.out.println(4);}
    }
}
