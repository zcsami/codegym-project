package fr.codegym.task.task08.task0805;

import java.util.HashMap;
import java.util.Map;

/* 
Valeurs à l'écran !
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Bébé", "Bébé");
        map.put("Chat", "Chat");
        map.put("Chien", "Chien");
        map.put("Manger", "Manger");
        map.put("Nourriture", "Nourriture");
        map.put("Gevey", "Gevey");
        map.put("Câlins", "Câlins");

        imprimerValeurs(map);
    }

    public static void imprimerValeurs(Map<String, String> map) {
        //écris ton code ici
        for(String key : map.keySet()) {
            String value = map.get(key);
            //System.out.println(key);
            System.out.println(value);
            //System.out.println(map.keySet());

        }
    }
}
