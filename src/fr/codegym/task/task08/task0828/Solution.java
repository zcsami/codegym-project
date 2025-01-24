package fr.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Nombre du mois
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> months = new ArrayList<>();
        months.add("Janvier");
        months.add("Février");
        months.add("Mars");
        months.add("Avril");
        months.add("Mai");
        months.add("Juin");
        months.add("Juillet");
        months.add("Août");
        months.add("Septembre");
        months.add("Octobre");
        months.add("Novembre");
        months.add("Décembre");

        String month = reader.readLine();
        if (months.contains(month)) {
            int monthNumber = months.indexOf(month) + 1;
            System.out.println(month + " est le mois numéro " + monthNumber);
        } else {
            System.out.println(month + " isn't a month");
        }
    }
}
