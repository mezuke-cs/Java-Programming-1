

import java.util.Scanner;
import java.text.DecimalFormat;

public class ProductCode 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat twodec = new DecimalFormat ("0.00");

        char pc; // pc = product code
        int quantity, stockA, stockB;
        double upA, upB, ad; // ad = amount due

        stockA = 20;
        stockB = 30;
        upA = 120;
        upB = 100;
        
/*      
        TABLE FOR REFERENCE
        ----------------------------------------------------
        |  PRODUCT CODE  |   UNIT PRICE   |AVAILABLE STOCKS|
        ----------------------------------------------------
        |        A       |     120.00     |       20       |
        ----------------------------------------------------
        |        B       |     100.00     |       30       |
        ----------------------------------------------------
*/

        System.out.print("Product Code   :      ");
        pc = input.next().charAt(0);
        pc = Character.toUpperCase(pc);

        if (pc == 'A' || pc == 'B') 
        {
            System.out.print("Quantity       :      ");
            quantity = input.nextInt();
            System.out.println("-----------------------------------");

            if (quantity >= 0) 
            {
                if (pc == 'A') 
                {
                    if (quantity <= stockA) 
                    {
                        System.out.println("Unit Price     :      " + twodec.format(upA));
                        ad = upA * quantity;
                        System.out.println("Amount Due     :      " + twodec.format(ad));
                    } 
                    else 
                    {
                        System.out.println("      Stocks not sufficient");
                    }
                } 
                else 
                {
                    if (quantity <= stockB) 
                    {
                        System.out.println("Unit Price     :      " + twodec.format(upB));
                        ad = upB * quantity;
                        System.out.println("Amount Due     :      " + twodec.format(ad));
                    } 
                    else 
                    {
                        System.out.println("      Stocks not sufficient");
                    }
                }
            } 
            else 
            {
                System.out.println("         Invalid quantity");
            }
        } 
        else 
        {
            System.out.println("-----------------------------------");
            System.out.println("       Product not available");
        }
    }
}
