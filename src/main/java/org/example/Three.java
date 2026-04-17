package org.example;

public class Three {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            boolean acomul = true ;
           for (int x = 2; x < i; x++) {
               if (i % x == 0) {
                   acomul = false ;
                   System.out.println("No es primo  " + i +  acomul);
               }else {
                   System.out.println("es primo " + i  + acomul);
               }
               break;
           }
        }
    }
}
