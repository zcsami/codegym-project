package fr.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/*
Nous n'avons pas besoin de répétitions
*/

public class Solution {
    public static HashMap<String, String> creerMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Stallone", "Sylvester");
        map.put("Stallone2", "Bruce");
        map.put("Stallone3", "Arnold");
        map.put("Schwarzenegger", "Sylvester");
        map.put("Schwarzenegger2", "Bruce");
        map.put("Schwarzenegger3", "Arnold");
        map.put("Willis", "Sylvester");
        map.put("Willis2", "Bruce");
        map.put("Willis3", "Arnold");
        map.put("Stallone4", "Sylvester4");
        return map;
    }

    public static void supprimerPrenomsIdentiques(Map<String, String> map) {
        HashMap<String, String> copie = new HashMap<>(map);

        for (String copyName : copie.values()) {
            int count = 0;
            for (String name : map.values()) {
                if (name.equals(copyName)) {
                    count++;
                }
            }
            if (count > 1) {
                supprimerElementMapParValeur(map, copyName);
            }
        }
    }

    public static void supprimerElementMapParValeur(Map<String, String> map, String valeur) {
        HashMap<String, String> copie = new HashMap<>(map);
        for (Map.Entry<String, String> paire : copie.entrySet()) {
            if (paire.getValue().equals(valeur)) {
                map.remove(paire.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
