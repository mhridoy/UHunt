package test;

import java.util.Scanner;

public class OpenCreditSystem {
    public static void main(String[] args) {
        try(Scanner in = new Scanner (System.in)){
           int  testCase = in.nextInt();

           while(testCase--!=0){
            int numOfStudents = in.nextInt();
            int max = in.nextInt();

            int ans = -Integer.MAX_VALUE;

            for (int i = 1; i < numOfStudents; i++) {
                
                int x = in.nextInt();

                if (max - x > ans)
				ans = max - x;
			if (x > max)
				max = x ;
            }
            
            System.out.println(ans);
           }
        }
    }
}
