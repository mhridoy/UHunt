
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
    try(Scanner in = new Scanner (System.in)){

        int caseCounting =0;

        while(in.hasNext()){

            double numOfStreets = in.nextDouble();
            double numberingRoads = in.nextDouble();
            double result = numOfStreets-numberingRoads;
            if(numOfStreets==0 && numberingRoads==0) return;

            if (numOfStreets<=numberingRoads)
            System.out.printf("Case %d: 0\n",++caseCounting);

            else if(numOfStreets/numberingRoads>26) 


            {
                


                    int pickResult = (int)(numOfStreets/numberingRoads);

                if(pickResult<=26)
                System.out.printf("Case %d: %d\n",++caseCounting,pickResult);

                else {
                    System.out.printf("Case %d: impossible\n",++caseCounting);
                }
            }   
            

            else if(result <=numberingRoads){



                System.out.printf("Case %d: 1\n",++caseCounting);

            }

            else{


                double div = result/numberingRoads;
                //System.out.println(div);
                int output = (int)Math.ceil((div));
                System.out.printf("Case %d: %d\n",++caseCounting,output);
            }

        }
    }
    }
}
