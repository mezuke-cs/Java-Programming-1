
    import java.util.Scanner;

public class AreaComputationSwitchcase 
{
    public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         
    char ac;//ac = area computation
    double circle,radius,rectangle,length,width,triangle,base,height;
    
     System.out.println("AREA COMPUTATION");
       System.out.println("[C] CIRCLE");
       System.out.println("[R] RECTANGLE");
       System.out.println("[T] TRIANGLE");
       System.out.println(" -----------------------------------   ");
       System.out.print("SELECT AREA TO COMPUTE :   ");
       ac=input.next().charAt(0);
       ac=Character.toUpperCase(ac);
       
      System.out.println(" -----------------------------------   ");
      
        switch (ac) {
            case 'C':
                System.out.println("               CIRCLE");
                System.out.print("RADIUS                 :    ");
                radius=input.nextDouble();
                circle = 3.14 * radius * radius;
                System.out.println(" -----------------------------------   ");
                System.out.println("AREA OF CIRCLE         :  "+ circle);
                break;
            case 'R':
                System.out.println("            RECTANGLE");
                System.out.print("LENGTH                 :    ");
                length=input.nextDouble();
                System.out.print("WIDTH                  :    ");
                width=input.nextDouble();
                rectangle = length * width;
                System.out.println(" -----------------------------------   ");
                System.out.println("AREA OF RECTANGLE      :  " + rectangle);
                break;
            case 'T':
                System.out.println("            TRIANGLE");
                System.out.print("BASE                   : ");
                base=input.nextDouble();
                System.out.print("HEIGHT                 : ");
                height=input.nextDouble();
                triangle = 0.5 * base * height;
                System.out.println(" -----------------------------------   ");
                System.out.println("AREA OF TRIANGLE       : " + triangle);
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }
     }
}
