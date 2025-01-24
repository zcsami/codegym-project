package fr.codegym.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Travail avec les dates
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(dateImpaire("MAY 1 2013"));
    }

    public static boolean dateImpaire(String date) throws ParseException {

        DateFormat df= new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Date d = df.parse(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);

        int day = calendar.get(Calendar.DAY_OF_YEAR);


        return (day % 2 !=0);
    }
}
