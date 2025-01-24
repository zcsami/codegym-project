package fr.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* 
Plus de 10 ? Ça ne va pas marcher.
*/

public class Solution {
    public static HashSet<Integer> creerSet() {
        // écris ton code ici
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0;i<20;i++) {
            Random random = new Random();
            int nombre = random.nextInt(21);
            while(set.contains(nombre)) {
                nombre = random.nextInt(21);
            }
            set.add(nombre);
        }
        return set;

    }

    public static HashSet<Integer> supprimerNombresSuperieursA10(HashSet<Integer> ensemble) {
        // écris ton code ici
        Iterator<Integer> iterator = ensemble.iterator();
        while (iterator.hasNext()) {
            int nombre = iterator.next();
            if (nombre>10) {
                iterator.remove();
            }
        }
        return ensemble;

    }

    public static void main(String[] args) {

    }
}
