package utils.Week_03;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(primeNum(-5));
    }

    public static boolean primeNum(int a) {

        if (!(a >= 1))
        return false;
    else{
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }return true;


    }
}