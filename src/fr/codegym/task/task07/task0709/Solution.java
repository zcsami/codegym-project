package fr.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Exprimons-nous de façon plus concise
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(bis.readLine());
        }

        String minSizeElement = list.get(0);
        for (String element : list) {
            if (element.length() < minSizeElement.length()) {
                minSizeElement = element;
            }
        }

        for (String element : list) {
            if (element.length() == minSizeElement.length()) {
                System.out.println(element);
            }
        }


    }
}
