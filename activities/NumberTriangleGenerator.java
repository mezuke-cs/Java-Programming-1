package Activities;

import java.util.Scanner;

public class NumberTriangleGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Input   :   ");
        num = input.nextInt();

        System.out.println("-------------------------");

        System.out.println("Output 1:");
        for (int i = 1; i <= num; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int output2 = 1;
        
        System.out.println("Output 2:");
        
        for (int k = 1; k <= num; k++) 
        {
            for (int l = 1; l <= k; l++) 
            {
                System.out.print(output2 + " ");
                output2++;
            }
            System.out.println();
        }
    }
}