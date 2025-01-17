package fr.codegym.task.task04.task0416;

/* 
Traverser les yeux fermés
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double modulo = a % 5;
        //System.out.println(modulo);
        if (0 <= modulo && modulo< 3) {
            System.out.println("vert");
        } else if (3<=modulo && modulo < 4) {
            System.out.println("jaune");
        } else if (4<=modulo && modulo < 5) {
            System.out.println("rouge");
        }

    }
}