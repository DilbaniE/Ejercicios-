package org.example;

public class Eight {
    public static void main(String[] args) {
        reporte(85, 90, 78);
        System.out.println("-----------------");
        reporte(40, 55, 60);

    }
    static double promedio(int n1,int n2,int n3){
        double promedio;
        promedio = (n1+n2+n3)/3;
        return promedio;
    }
    
    static boolean aprobado(double promedio){
        if(promedio>= 60){
            return true;
        }else {
            return false;
        }

    }
    
    static String letra(double promedio){
        if(promedio >= 90 && promedio <= 100 ){
            return "A";
        } else if (promedio >= 80 && promedio <= 89 ) {
            return "B";
        } else if (promedio >= 70 && promedio <= 79 ) {
            return "C";
        } else if (promedio >= 60 && promedio <= 69 ) {
            return "D";
        }else {
            return "F";
        }
    }

    static void reporte(int n1,int n2, int n3){
        double prom = promedio(n1, n2, n3);
        String l = letra(prom);
        String estado = aprobado(prom) ? "Aprobado" : "Reprobado";
        System.out.println("Promedio: " + prom);
        System.out.println("Letra: " + l);
        System.out.println("Estado: " + estado);
    }
}
