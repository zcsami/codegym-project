package fr.codegym.task.task03.task0318;

/* 
Plan de conquête du monde
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
       // System.out.print("Enter le temps :\n");
        int temps = Integer.parseInt(scanner.nextLine());
       // System.out.print("Enter le nom: \n ");
        String nom = scanner.nextLine();


        System.out.print(nom + " conquerra le monde dans " + temps +" ans. Moua-ha-ha !");

    }
}
