package fr.codegym.task.task04.task0424;

/* 
Trois nombres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if(b==c) System.out.println(1);
        if(a==c) System.out.println(2);
        if(a==b) System.out.println(3);
    }
}
