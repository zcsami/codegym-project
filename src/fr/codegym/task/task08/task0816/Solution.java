package fr.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
La gentille Emma et les vacances d'été
*/

public class Solution {
    public static HashMap<String, Date> creerMap() throws ParseException {
        // on créer
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();

        //écris ton code ici
        map.put("Stallone", df.parse("June 1 1980"));
        map.put("Delon", df.parse("May 8 1940"));
        map.put("Depardieu", df.parse("December 27 1948"));
        map.put("Deneuve", df.parse("October 22 1943"));
        map.put("Belmondo", df.parse("April 9 1933"));
        map.put("Bardot", df.parse("September 28 1934"));
        map.put("Huppert", df.parse("March 16 1953"));
        map.put("Reno", df.parse("July 30 1948"));
        map.put("Adjani", df.parse("June 27 1955"));
        map.put("Matisse", df.parse("January 1 1981"));

        return map;
    }

    public static void supprimerToutesPersonnesEte(HashMap<String, Date> map) {
        // Utiliser un Iterator pour éviter ConcurrentModificationException
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            HashMap.Entry<String, Date> entry = iterator.next();
            Date date = entry.getValue();

            // Vérifier si la personne est née en été (mois de 5 = juin, 6 = juillet, 7 = août)
            int mois = date.getMonth(); // Déprécié, mais fonctionne (mois : 0 = janvier, 11 = décembre)
            if (mois >= 5 && mois <= 7) {
                iterator.remove(); // Supprimer en toute sécurité
            }
        }
    }

    public static void main(String[] args) {

    }
}
