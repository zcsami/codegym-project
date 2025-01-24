package fr.codegym.task.task08.task0815;

import java.util.*;

/* 
Recensement
*/

public class Solution {
    public static HashMap<String, String> creerMap() {
        //écris ton code ici
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "A");
        map.put("B", "B");
        map.put("C", "E");
        map.put("D", "F");
        map.put("E", "F");
        map.put("F", "F");
        map.put("G", "Z");
        map.put("H", "I");
        map.put("S", "I");
        map.put("J", "K");
        return map;



    }

    public static int obtenirNombrePrenomsIdentiques(HashMap<String, String> map, String nom) {
        //écris ton code ici
        int compteur = 0;
        Collection<String> values = map.values();
      for(String prenom : values) {
          if(prenom.equals(nom)) {
              compteur++;

          }
      }
        return compteur;

    }

    public static int obtenirNombreNomsIdentiques(HashMap<String, String> map, String nom) {
        //écris ton code ici
        Set<String> setNom = map.keySet();
        Iterator<String> iterator = setNom.iterator();
        int compteur = 0;
        while (iterator.hasNext()) {
            String nomEnCours = iterator.next();
            if (nomEnCours.equals(nom)) {
                compteur++;
            }
        }

        return compteur;

    }

    public static void main(String[] args) {

    }
}
