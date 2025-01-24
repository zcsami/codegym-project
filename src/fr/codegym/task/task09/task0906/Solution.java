package fr.codegym.task.task09.task0906;

/* 
Enregistrement des traces de pile
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        journaliser("Dans la méthode main");
    }

    public static void journaliser(String s) {
        //écris ton code ici
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String nomClasse = stackTraceElements[2].getClassName();
        String nomMethod = stackTraceElements[2].getMethodName();
        String param = s;
        System.out.println(nomClasse+": "+nomMethod+": "+param);
    }
}
