package fr.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Quelle est la date d'aujourd'hui ?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //écris ton code ici
        try {
            SimpleDateFormat input = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s  = reader.readLine();
            Date date = input.parse(s);
            SimpleDateFormat output = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
            System.out.println((output.format(date)).toUpperCase());
        } catch (Exception e) {
            System.out.println("probleme");

        }


    }
}
