package org.example;

public class Seven {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int edad = 10;
        System.out.println(mayorDeEdad(edad));
    }

        static String mayorDeEdad (int edad){
            if(edad>=18){
                return "MAYOR DE EDAD";
            }else{
                return "Menor de edad";
            }

        }

}
