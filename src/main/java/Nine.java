public class Nine {
    public static void main(String[] args) {
        System.out.println(potencia(2,10));
        System.out.println(potencia(5,3));

    }
    static int potencia(int base, int exp) {
        int count = 1;
        System.out.println( base + " ^ " + exp + " = " );
       for (int i = 0; i <= exp; i++) {
           count = count * base;
       }
        return count;
    }
}
