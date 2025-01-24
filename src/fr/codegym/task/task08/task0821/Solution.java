package fr.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Noms de famille et prénoms partagés
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = creerMapPersonnes();
        imprimerMapPersonnes(map);
    }

    public static Map<String, String> creerMapPersonnes() {
        //écris ton code ici
        HashMap<String, String> personnes = new HashMap<>();
        personnes.put("Dupont", "Alice");
        personnes.put("Martin", "Bob");
        personnes.put("Dupuis", "Alice");
        personnes.put("Moreau", "Claire");
        personnes.put("Lemoine", "Bob");
        personnes.put("Durand", "Élise");
        personnes.put("Bernard", "David");
        personnes.put("Martin", "Claire");
        personnes.put("Thomas", "Alice");
        personnes.put("Durand", "Éric");


        return personnes;
    }

    public static void imprimerMapPersonnes(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
