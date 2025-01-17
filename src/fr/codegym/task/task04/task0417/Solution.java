package fr.codegym.task.task04.task0417;

/* 
Avons-nous une paire ?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if (a == b && b == c ) {
            System.out.println(a + " "+ b + " " + c);
        } else if (a == b || a == c ) {
            System.out.println(a + " "+  a );
        } else if (b == c ) {
            System.out.println(b + " "+  b);

        }


    }
}