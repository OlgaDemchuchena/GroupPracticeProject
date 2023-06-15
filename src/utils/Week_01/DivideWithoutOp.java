package utils.Week_01;

public class DivideWithoutOp {
    public static void divisionNoOp(int a, int b){


       int x = 0;

         while(a >= b){
           a=a-b;
           x++;
       }

            System.out.println(x);

    }
}
