package fr.codegym.task.task03.task0307;

/* 
Ohé, StarCraft !
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici

        Zerg z1 = new Zerg();
        z1.nom ="z1";
        Zerg z2 = new Zerg();
        z2.nom ="z2";
        Zerg z3 = new Zerg();
        z3.nom ="z3";
        Zerg z4 = new Zerg();
        z4.nom ="z4";
        Zerg z5 = new Zerg();
        z5.nom ="z5";

        Protoss p1 = new Protoss();
        p1.nom ="p1";
        Protoss p2 = new Protoss();
        p2.nom ="p2";
        Protoss p3 = new Protoss();
        p3.nom ="p3";


        Terran t1 = new Terran();
        t1.nom ="t1";
        Terran t2 = new Terran();
        t2.nom ="t2";
        Terran t3 = new Terran();
        t3.nom ="t3";
        Terran t4 = new Terran();
        t4.nom ="t4";






    }

    public static class Zerg {
        public String nom;
    }

    public static class Protoss {
        public String nom;
    }

    public static class Terran {
        public String nom;
    }
}
