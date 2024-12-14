
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int end, sor;

        System.out.print("Dividend  :       ");
        end = input.nextInt();

        System.out.print("Divisor   :       ");
        sor = input.nextInt();

        System.out.println("-----------------------------------");

        if (end <= 0 || sor <= 0) 
        {
            System.out.println("Zero/Negative number/s not accepted");
        } 
        else 
        {
            int quotient = 0, remainder = end;

            while (remainder >= sor) 
            {
                remainder -= sor;
                quotient++;
            }
            
            System.out.println("Quotient  :       " + quotient);

            if (remainder > 0) 
            {
                System.out.println("Remainder :       " + remainder);
            }
        }

    }
}
