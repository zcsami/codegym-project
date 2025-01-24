package fr.codegym.task.task06.task0617;

/* 
Un carnet pour de nouvelles idées
*/

public class Solution {
    public static void main(String[] args) {
        imprimerIdee(new Idee());
    }

    //écris ton code ici
    public static class Idee{
        public String obtenirDescription(){
            return "Obtenir description";
        }
    }

    public static void imprimerIdee(Idee idee) {
        System.out.println(idee.obtenirDescription());

    }
}
