package fr.codegym.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Mission sur les algorithmes
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(lecteur.readLine());

        if (number <= 0) {
            return;
        }

        int[] data = new int[number];
        for (int i = 0; i < number; i++) {
            data[i] = Integer.parseInt(lecteur.readLine());
        }

        int maximum = data[0];
        for (int i = 1; i < number; i++) {
            if (data[i] > maximum) {
                maximum = data[i];
            }
        }

        System.out.println(maximum);
    }

}
