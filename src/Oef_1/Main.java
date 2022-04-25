package Oef_1;

public class Main {

    public static void primeNumbers() {
        for (int i = 1; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j > 1; j--) {
                if(i%j == 0) {
                    isPrime = false;
                    continue;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Main.primeNumbers();
    }

}

