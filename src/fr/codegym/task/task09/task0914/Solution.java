package fr.codegym.task.task09.task0914;

/* 
Capturer un groupe d'exceptions
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        try {
            methode1();
        }
        catch (Exception3 e3){
            System.out.println(e3.getMessage());
        }
        catch (Exception2 e2) {
            System.out.println(e2.getMessage());
        }
        catch (Exception1 e) {
            System.out.println(e.getMessage());
        }

        //écris ton code ici

    }

    public static void methode1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        }
        if (i == 1) {
            throw new Exception2();
        }
        if (i == 2) {
            throw new Exception3();
        }
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
