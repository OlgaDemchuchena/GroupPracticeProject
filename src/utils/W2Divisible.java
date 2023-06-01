package utils;

import java.util.ArrayList;

public class W2Divisible {
    public static void main(String[] args) {

        ArrayList<Integer> DivisibleBy15 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy5 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy3 = new ArrayList<>();

        for(int i=1; i<=100; i++){
            if(i%15==0 & i%5==0 & i%3==0){
                DivisibleBy15.add(i);
            }
            if(i%5==0 & !(i%15==0)){
                DivisibleBy5.add(i);
            }
            if(i%3==0 & !(i%15==0)){
                DivisibleBy3.add(i);
            }
        }

        System.out.println("Divisible by 15 "+ DivisibleBy15);
        System.out.println("Divisible by 5 "+ DivisibleBy5);
        System.out.println("Divisible by 3 "+ DivisibleBy3);

    }
}
