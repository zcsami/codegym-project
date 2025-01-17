package fr.codegym.task.task04.task0419;

/* 
Le plus grand de quatre nombres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int max;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        max = a;
        int b = Integer.parseInt(reader.readLine());
        if (b>max) max = b;
        int c = Integer.parseInt(reader.readLine());
        if (c>max) max = c;
        int d = Integer.parseInt(reader.readLine());
        if (d>max) max = d;

        System.out.println(max);



    }
}
