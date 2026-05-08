public class Nine {
    public static void main(String[] args) {
        System.out.println(potencia(2,10));
        System.out.println(potencia(5,3));
        System.out.println(factorial(7));
        System.out.println(numPrimo(17));

    }
    static int potencia(int base, int exp) {
        int count = 1;
        System.out.println( base + " ^ " + exp + " = " );
       for (int i = 0; i <= exp; i++) {
           count = count * base;
       }
        return count;
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 1;
        System.out.println(n + " ! " + " = ");
        for (int i = 1; i <= n; i++) {
            count = count * i;
        }
        return count;
    }


    static boolean numPrimo(int n) {
        int result = 0;
        System.out.println(n + " Es primo? ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result = result + 1;
            }
        }
        if (result == 2) {
            return true;
        }
        return false;
    }

    }

