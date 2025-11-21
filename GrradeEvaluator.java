import java.util.Scanner;

/**
 * Write a description of class GrradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GrradeEvaluator
{
    public static void main (String[] args)
    {
        Scanner grade= new Scanner (System.in);
        System.out.println("Enter your grade");
        int marks = grade.nextInt();
        String comp = (marks>=40)?"YOU PASSED":"YOU FAILED";
        System.out.println(comp);
        
        
        
        
    }
}