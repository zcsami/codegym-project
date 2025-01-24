package fr.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Classe LecteurConsole
*/

public class LecteurConsole {



    public static String lireString() throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return  reader.readLine();
    }

    public static int lireInt() throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());

    }

    public static double lireDouble() throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());

    }

    public static boolean lireBoolean() throws Exception {
        //écris ton code ici
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return (reader.readLine().equals("true"));

    }

    public static void main(String[] args) throws Exception {
        System.out.println(lireBoolean());

    }
}
