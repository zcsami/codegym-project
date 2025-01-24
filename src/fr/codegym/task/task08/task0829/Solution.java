package fr.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
Mise à jour logicielle
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> adresses = new HashMap<>();
        while (true) {
            String city = lecteur.readLine();
            if (city.isEmpty()) {
                break;
            }
            String famille = lecteur.readLine();

            adresses.put(city, famille);
        }

        //read home number
        String city = lecteur.readLine();

        if (adresses.containsKey(city)) {
            String nomFamille = adresses.get(city);
            System.out.println(nomFamille);
        }
    }
}
