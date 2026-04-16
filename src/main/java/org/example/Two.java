package org.example;

public class Two {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println( "ff" + i);
            for (int j = 1; j <= 10; j++) {
                int resul = i * j;
                System.out.println(i + " * " + j + " =" + resul);
            }
        }
    }
}
