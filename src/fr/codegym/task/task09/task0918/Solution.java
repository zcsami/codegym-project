package fr.codegym.task.task09.task0918;

/* 
Nous sommes tous amis ici, même les exceptions
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MonException extends RuntimeException {
    }

    static class MonException2 extends RuntimeException {
    }

    static class MonException3 extends IOException{
    }

    static class MonException4  extends IOException{
    }
}

