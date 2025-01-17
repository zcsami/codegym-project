package fr.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Amélioration de fonctionnalité
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  a = Integer.parseInt(reader.readLine());
        int  b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        System.out.println("Minimum = "+ min(a,b,c,d,e));




    }



    public static int min(int a, int b, int c, int d, int e){
        int minimum= 0;
        if(a<b) minimum = a ; else minimum = b;
        if(c<minimum) minimum = c;
        if(d<minimum) minimum = d;
        if(e<minimum) minimum = e;
     return minimum;

    }
}
