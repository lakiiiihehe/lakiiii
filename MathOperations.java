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
        int sum = a+b ;
        int diff = a-b ;
        int mul = a*b ;
        int div = a/b ;
        

        System.out.println("the answer is :"+sum);
        System.out.println("the answer is :"+diff);
        System.out.println("the answer is :"+mul);
        System.out.println("the answer is :"+div);
        
        
        //unary
        int pre_incriment= ++a;
        int post_incriement= a++; // a++ mo value chnage gardaina
        
        int pre_dec= --a;
        int post_dec= a--;
        System.out.println(pre_dec);
        System.out.println(post_dec);
        
        // assignment 
        String ram = "nepal ";
        
        
        
        // ternary 
        String turn= (a%2==0)?"even":"odd";
        
        ///relaional
        boolean e= (a==b);
        boolean g= (a>b);
        boolean l= (a<b);
        boolean v= (a>=b);
        System.out.println(e);
        System.out.println(g);
        System.out.println(l);
        System.out.println(v);
        
        
        // logical 
        
        int num1 = 12;
        int num2 = 34;
        int num3 = 45;
        boolean res=(num1>num2 && num1>num3);
        System.out.println("the condition is "+res);
        boolean re=(num1>num2 || num1>num3);
        System.out.println("the condition is "+re);
        
        
        
        
        
        
        
         
        
        
        
        
        
        
                
        
        
    }
}