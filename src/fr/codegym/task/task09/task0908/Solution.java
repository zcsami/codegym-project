package fr.codegym.task.task09.task0908;

/* 
Exception lors du travail avec des chaînes
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        try {
            String s = null;
            String m = s.toLowerCase();

            //écris ton code ici
        } catch (NullPointerException e){
            String s = e.getMessage();
            String t = e.getClass().getTypeName();
            System.out.println(s +" "+t);

        }
    }
}
