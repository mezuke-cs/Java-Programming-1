
import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeComputationRemarks 
{
    public static void main(String[]args)
    {
        Scanner grade = new Scanner (System.in);
        DecimalFormat twodec = new DecimalFormat("0.00");
        
        int q,a,p,e,cs;
        double fg;
                
        q=0;a=0;p=0;e=0;cs=0;
        System.out.print("Quiz           :  ");
        q=grade.nextInt();
        System.out.print("Activity       :  ");
        a=grade.nextInt();
        System.out.print("Project        :  ");
        p=grade.nextInt();
        System.out.print("Exam           :  ");
        e=grade.nextInt();
        System.out.print("Class Standing :  ");
        cs=grade.nextInt();
        
        fg=(q*0.20+a*0.15+p*0.25+e*0.30+cs*0.10);
        System.out.println("--------------------------------------------------");
        System.out.println("Final Grade    :  " + twodec.format(fg));
        System.out.print("Remarks        :  ");
        if (fg>=75)
            System.out.print("PASSED");
        else
            System.out.print("FAILED");
         System.out.println("");
    }
}
