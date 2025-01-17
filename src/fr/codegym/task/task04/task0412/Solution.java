package fr.codegym.task.task04.task0412;

/* 
Nombres positifs et négatifs
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a>0) a = a *2 ;
        if(a<0) a++;
        System.out.println(a);



    }

}