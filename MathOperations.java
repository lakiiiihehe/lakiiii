import java.util.Scanner;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println("enter second number");
        
        //arthemetic 
        int b = scan.nextInt();
        int sum = a=b ;
        System.out.println("the answer is :"+sum);
        int pre_incriment= ++a;
        int post_incriement= a++;
        System.out.println(pre_incriment);
        System.out.println(post_incriement);
        
        
        
        
        
                
        
        
    }
}