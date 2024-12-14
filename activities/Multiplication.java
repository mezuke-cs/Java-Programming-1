

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, product;

        System.out.print("Multiplicand  :       ");
        num1 = input.nextInt();

        System.out.print("Multiplier    :       ");
        num2 = input.nextInt();

        System.out.println("------------------------------");

        if (num1 >= 0 && num2 >= 0) 
        {
            product = 0;
            for (int solver = 0; solver < num2; solver++) 
            {
                product += num1;
            }
            
            System.out.println("Product       :       " + product);
        } 
        else 
        {
            System.out.println("Negative number/s not accepted");
        }
    }
}
