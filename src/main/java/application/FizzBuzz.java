package application;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 15;
        printFizzBuzz(n);
    }

    public static String play(int n) {
        if (eDivisivelPorTres(n) && eDivisivelPorCinco(n)) {
            return "FizzBuzz";
        } else if (eDivisivelPorTres(n)) {
            return "Fizz";
        } else if (eDivisivelPorCinco(n)) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }


    }

    private static boolean eDivisivelPorCinco(int n) {
        return (n % 5) == 0;
    }

    private static boolean eDivisivelPorTres(int n) {
        return n % 3 == 0;
    }

    public static void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(play(i));
        }
    }


}
