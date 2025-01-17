package fr.codegym.task.task05.task0528;

/* 
Afficher la date d'aujourd'hui
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
      class Date{
            int mois;
            int jour;
            int annee;

            public Date(int mois, int jour, int annee) {
                this.mois = mois;
                this.jour = jour;
                this.annee = annee;
            }

          @Override
          public String toString() {
            return(mois+" "+jour+" "+annee);
          }
      }

      Date date = new Date(01,17,2025);
      System.out.println(date);
    }
}
