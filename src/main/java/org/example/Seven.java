package org.example;

public class Seven {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int edad = 18;
        int edad2 = 65;
        int edad3 = 10;
        int edad4 = 15;
        int edad5 = 25;


        System.out.println("Es mayor de edad: " + mayorDeEdad(edad));
        System.out.println("Clasificacion de la edad "+  clasiEdad(edad));
        System.out.println("Años por jubilarse " + anosJubilacion(edad));
        System.out.println("----------");
        System.out.println("Es mayor de edad: " + mayorDeEdad(edad2));
        System.out.println("Clasificacion de la edad "+  clasiEdad(edad2));
        System.out.println("Años por jubilarse " + anosJubilacion(edad2));
        System.out.println("----------");
        System.out.println("Es mayor de edad: " + mayorDeEdad(edad3));
        System.out.println("Clasificacion de la edad "+  clasiEdad(edad3));
        System.out.println("Años por jubilarse " + anosJubilacion(edad3));
        System.out.println("----------");
        System.out.println("Es mayor de edad: " + mayorDeEdad(edad4));
        System.out.println("Clasificacion de la edad "+  clasiEdad(edad4));
        System.out.println("Años por jubilarse " + anosJubilacion(edad4));
        System.out.println("----------");
        System.out.println("Es mayor de edad: " + mayorDeEdad(edad5));
        System.out.println("Clasificacion de la edad "+  clasiEdad(edad5));
        System.out.println("Años por jubilarse " + anosJubilacion(edad5));
        System.out.println("----------");

    }

        static boolean mayorDeEdad (int edad){
            if(edad>=18){
                return true;
            }else{
                return false;
            }
        }

        static String clasiEdad(int edad){
            if( edad >= 5 && edad <= 10){
                return "niño";
            }else if(edad>= 10 && edad < 18) {
                return "Adolecente";
            }else{
                return "Adulto";
            }
        }

        static  int anosJubilacion(int edad){
          int jubilacion= 65;
          int anosPorJubi = jubilacion - edad;
            if (edad >= jubilacion) {
                return 0;
            }
            return anosPorJubi ;
        }

}
