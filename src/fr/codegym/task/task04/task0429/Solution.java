package fr.codegym.task.task04.task0429;

/* 
Nombres positifs et négatifs
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int compteurNegatif=0, compteurPositif=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if(a>0) compteurPositif++;
        if(a<0) compteurNegatif++;
        int b = Integer.parseInt(reader.readLine());
        if(b>0) compteurPositif++;
        if(b<0) compteurNegatif++;
        int c = Integer.parseInt(reader.readLine());
        if(c>0) compteurPositif++;
        if(c<0) compteurNegatif++;

        System.out.println("Nombre de nombres négatifs : " + compteurNegatif);
        System.out.println("Nombre de nombres positifs : " + compteurPositif);

    }
}
