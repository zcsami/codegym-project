package fr.codegym.task.task08.task0802;

/* 
HashMap de 10 paires
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        HashMap<String, String> map = new HashMap<>();
        map.put("pastèque", "melon");
        map.put("banane", "fruit");
        map.put("cerise", "fruit");
        map.put("poire", "fruit");
        map.put("melon", "melon");
        map.put("mûre", "fruit");
        map.put("ginseng", "racine");
        map.put("fraise", "fruit");
        map.put("iris", "fleur");
        map.put("pomme de terre", "tubercule");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
