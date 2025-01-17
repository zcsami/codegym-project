package fr.codegym.task.task04.task0418;

/* 
Le plus petit de deux nombres
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a == b){
            System.out.println(a );
        } else if (a < b){
            System.out.println(a );
        } else { System.out.println(b);}
    }
}