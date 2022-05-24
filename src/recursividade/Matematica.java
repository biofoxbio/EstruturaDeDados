package recursividade;

public class Matematica {

    public static double fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static int fibbonacci(int ordem) {
        if (ordem <= 2) {
            return 1;
        } else {
            return fibbonacci(ordem - 1) + fibbonacci(ordem - 2);
        }
    }

    public static void hanoi(int n, int a, int b, int c) {
        if (n == 1) {
            System.out.println(
            "Mova disco 1 da torre " + a + " para a torre " + c
          
            );
        }
        
 else {
                    hanoi(n - 1, a, c, b);
            System.out.println("Move disco " + n + " da torre " + a + "para a torre " + c);
         hanoi(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        //System.out.println(Matematica.fatorial(0));
        //System.out.println(Matematica.fibbonacci(11));
        Matematica.hanoi(64 , 6, 2, 1);
       // getTimeMiles
        
    }
}
