package fr.codegym.task.task08.task0801;

/* 
HashSet de plantes
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        //HashSet<String> set = new HashSet<>(Arrays.asList("pastèque","banane","cerise","poire","melon","mûre","ginseng","fraise","iris","pomme de terre"));
        HashSet<String> set = new HashSet<>();
        set.add("pastèque");
        set.add("banane");
        set.add("cerise");
        set.add("poire");
        set.add("melon");
        set.add("mûre");
        set.add("ginseng");
        set.add("fraise");
        set.add("iris");
        set.add("pomme de terre");
        for (String s : set) {
            System.out.println(s);
        }


    }
}
