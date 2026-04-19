package org.example;

public class Four {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
            String count = ("*");
            for (int k = 1; k<= 5; k++) {
                count += ("*");
                System.out.println(count);
            }
        }
    }
}
