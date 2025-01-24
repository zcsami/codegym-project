package fr.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Réservé aux riches
*/

public class Solution {
    public static HashMap<String, Integer> creerMap() {
        //écris ton code ici
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1000);
        map.put("B", 500);
        map.put("C", 100);
        map.put("D", 200);
        map.put("E", 530);
        map.put("F", 600);
        map.put("G", 800);
        map.put("H", 900);
        map.put("I", 100);
        map.put("J", 200);
        return map;
    }

    public static void supprimerElementMap(HashMap<String, Integer> map) {
        //écris ton code ici
        HashMap<String, Integer> mapCopy = new HashMap<>(map);
        for (Map.Entry<String, Integer> entry : mapCopy.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value<500){
                map.remove(key);
            }

        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = creerMap();
        supprimerElementMap(map);

    }
}