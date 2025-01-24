package fr.codegym.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/*
Capture d'exceptions personnalisées
*/

public class Solution {
    public static BeanSansEtat BEAN = new BeanSansEtat();

    public static void main(String[] args) {
        try {
            gererExceptions();
        } catch (FileSystemException e) {
            BEAN.journaliser(e);
        }
    }

    public static void gererExceptions() throws FileSystemException {
        try {
            BEAN.leverExceptions();
        } catch (FileSystemException exception) {
            BEAN.journaliser(exception);
            throw exception;
        } catch (IOException exception) {
            BEAN.journaliser(exception);
        }
    }

    public static class BeanSansEtat {
        public void journaliser(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void leverExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            }
            if (i == 1) {
                throw new FileSystemException("");
            }
            if (i == 2) {
                throw new IOException();
            }
        }
    }
}
