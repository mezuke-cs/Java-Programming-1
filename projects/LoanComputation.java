import java.util.Scanner;
import java.text.DecimalFormat;

public class loanComputation {

public static void main(String[] args) 

{
    Scanner input = new Scanner(System.in);
    char choice;
    
    System.out.println("Project No. 3");
    System.out.println("Project Title : Loan Computationtite");
    System.out.println("BSIT 1C - G2\n");

    choice='Y';
      do{
          menu();
         System.out.println ("Do you want to try again? (Y/N)\n");
         choice=input.next().charAt(0);  
         System.out.println("\n----------------------------------------");  
         }
            while(Character.toUpperCase(choice)=='Y');
}
public static void menu()
{
    int loantype;
    
    Scanner input = new Scanner(System.in);

    System.out.println("[1] Regular Loan");
    System.out.println("[2] Emergency Loan");
    System.out.println("[3] Cancel");
    System.out.println("----------------------------------------");  
    System.out.print("Loan Type            : ");
    loantype = input.nextInt();
    System.out.println("----------------------------------------");  

    loanOperation(loantype);

}
public static double inputAmount() 
{
    Scanner input = new Scanner(System.in);
    DecimalFormat twodec = new DecimalFormat("0.00");

    double amount;
    
    System.out.print("Enter the loan amount: ");
    amount = input.nextDouble();
    System.out.println("----------------------------------------");
    return amount;
}

public static void loanOperation(int loantype)
{
    double amount;

    switch (loantype)
    {
        case 1 : 
        {
            amount = inputAmount();
            regularLoan(amount);
            break;
        }
        case 2 :
        {
            amount = inputAmount();
            emergencyLoan(amount);
            break;
        }
        case 3 :
        {
            System.exit(0);
        }
        default : 
        {
            System.out.println("You have entered an invalid choice");
            break;
        }
    }
    System.out.println("----------------------------------------");
}
public static double regularLoan(double amount)
{
    int monthly;
    double rate, amountdue, interest;  
    Scanner input = new Scanner(System.in);
    rate = 0.10;
    System.out.println("Interest Rate for Regular Loan: 10% annually");
    System.out.println("Terms of Payment");
    System.out.println("[A] 1 Year");
    System.out.println("[B] 2 Years");
    System.out.println("----------------------------------------");
    System.out.print("Time                 : ");
    char time = input.next().charAt(0);
    time = Character.toUpperCase(time);
    

    if (time== 'A')
    {
        monthly = 1 * 12;
        interest = amount * rate * 1;
    }
    else if (time == 'B') 
    {
        monthly = 2 * 12;
        interest = amount * rate * 2;
    }
    else
    {
        System.out.println("");
        System.out.println("Invalid input. Try again.");
        return 0;
    }
    amountdue = amount + interest;

    receipt(amount, interest, amountdue, monthly);

    return amountdue;
}
public static double emergencyLoan(double amount)
{   
    int monthly;
    double rate , amountdue, interest;
    Scanner input = new Scanner(System.in);
    rate = 0.01;
    System.out.println("Interest Rate for Emergency Loan: 1% monthly");
    System.out.println("Terms of Payment");
    System.out.println("[A] 3 Months");
    System.out.println("[B] 6 Months");
    System.out.println("----------------------------------------"); 
    System.out.print("Time                 : ");
    char time = input.next().charAt(0);
    time = Character.toUpperCase(time);
    
    if (time== 'A')
    {
        monthly = 3;
        interest = amount * rate * 3;
    }
    else if (time == 'B') 
    {
        monthly = 6; 
        interest = amount * rate * 6;
    }
    else
    {
        System.out.println("");
        System.out.println("Invalid input. Try again.");
        return 0;
    }
    amountdue = amount + interest;
    
    receipt(amount, interest, amountdue, monthly);
    
    return amountdue;
}
public static void receipt(double amount, double interest, double amountdue, int monthly)
{
    DecimalFormat twodec = new DecimalFormat("0.00");

    System.out.println("----------------------------------------");
    System.out.println("Loan Amount          : " + twodec.format(amount));
    System.out.println("Total Interest       : " + twodec.format(interest));
    System.out.println("Total Amount Due     : " + twodec.format(amountdue));
    System.out.println("Monthly Amortization : " + twodec.format(amountdue / monthly)); // Monthly amortization
}
}
