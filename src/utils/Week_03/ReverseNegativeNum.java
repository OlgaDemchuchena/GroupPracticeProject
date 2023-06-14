package utils.Week_03;

public class ReverseNegativeNum {

    public static void main(String[] args) {
        System.out.println(reverseNum(-123));
    }

    public static int reverseNum(int a) {

        int revA = 0;

        while (a !=0){
            revA = revA * 10 + a % 10;
            a = a / 10;
        }

        return revA;
    }

}




