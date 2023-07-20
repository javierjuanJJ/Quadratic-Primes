package org.example;

public class QuadraticPrimes {

    private static boolean isPrimeNumber(int number) {
        boolean isPrimeNumber = false;

        for (int counter = 2; counter < number && !isPrimeNumber; counter++) {
            // System.out.println(number % counter);
            isPrimeNumber = number % counter == 0;
        }

        return isPrimeNumber;
    }


    private static int numberOfConsecutivePrimesGenerated(int a, int b) {
        int n = 0;
        int i = 0;
        for (i = 0; (n < 0 || !isPrimeNumber(n)); i++) {
            n = (i * i) + (i * a) + b;
        }
        // System.out.println(i);
        return i;

    }


    public static int run(int number) {
        int bestNum = 0;
        int bestA = 0;
        int bestB = 0;

        int num = 0;

        int a = 0;
        int b = 0;

        for (a = -number; a <= number; a++) {

            for (b = -number; b <= number; b++) {
                num = numberOfConsecutivePrimesGenerated(a, b);

                if (num > bestNum) {
                    System.out.println(bestNum);
                    bestNum = num;
                    bestA = a;
                    bestB = b;
                }
            }
        }
        return (bestA) * (bestB);

    }

}
