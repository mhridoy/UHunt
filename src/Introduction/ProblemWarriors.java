package Introduction;

import java.util.Scanner;

public class ProblemWarriors {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();


        while (test--!=0){
            long warriors = in.nextLong();

            long result = (long) (-1+Math.sqrt(1+8*warriors))/2;
            System.out.println(result);
        }
    }
}