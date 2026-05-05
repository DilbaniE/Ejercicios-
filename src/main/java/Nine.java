public class Nine {
    public static void main(String[] args) {
        System.out.println(potencia(2,10));
        System.out.println(potencia(5,3));
        System.out.println(factorial(5));

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
        int count = 1;
        System.out.println(n + " ! " + " = ");
        for (int i = 1; i <= n; i++) {
            count = i * n;
            count = count * i;
            System.out.println(count);
        }
        if (n == 0) {
            return 1;
        }
        return count;
    }
}
