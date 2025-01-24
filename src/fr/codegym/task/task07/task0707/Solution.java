package fr.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
Qu'est-ce que c'est que cette liste ?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
