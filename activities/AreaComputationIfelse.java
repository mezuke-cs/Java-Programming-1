
    import java.util.Scanner;

public class AreaComputationIfelse 
{
    public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         
    int ac;//ac = area computation
    double circle,radius,rectangle,length,width,triangle,base,height;
    
     System.out.println("AREA COMPUTATION");
       System.out.println("[1] CIRCLE");
       System.out.println("[2] RECTANGLE");
       System.out.println("[3] TRIANGLE");
       System.out.println(" -----------------------------------   ");
       System.out.print("SELECT AREA TO COMPUTE :   ");
       ac=input.nextInt();
       
      System.out.println(" -----------------------------------   ");
      
      if (ac==1)
      {
          System.out.println("           AREA OF CIRCLE");
          System.out.print("RADIUS                 :    ");
          radius=input.nextDouble();
          circle = 3.14 * radius * radius;
          System.out.println(" -----------------------------------   ");
          System.out.println("AREA OF CIRCLE         :  "+ circle);
      }
         else if (ac==2)
         {
          System.out.println("        AREA OF RECTANGLE");
          System.out.print("LENGTH                 :    ");
          length=input.nextDouble();
          System.out.print("WIDTH                  :    ");
          width=input.nextDouble();
          rectangle = length * width;
          System.out.println(" -----------------------------------   ");
          System.out.println("AREA OF RECTANGLE      :  " + rectangle);
         }
             else if (ac==3)
             {
                 System.out.println("        AREA OF TRIANGLE");
                 System.out.print("BASE                   : ");
                 base=input.nextDouble();
                 System.out.print("HEIGHT                 : ");
                 height=input.nextDouble();
                 triangle = 0.5 * base * height;
                 System.out.println(" -----------------------------------   ");
                 System.out.println("AREA OF TRIANGLE       :   " + triangle);                 
             }
                else
                {
                System.out.println("INVALID CHOICE");
                }
     }
}
