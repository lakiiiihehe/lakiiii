import java.util.Scanner;

/**
 * Write a description of class workshop here.
 *
 * @author Lucky Maharjan
 * @version v1
 */
public class workshop
{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in); // input magxa 
        System.out.println("Enter first number :");
        int firstnum=scan.nextInt(); //  checks if the entered is a int 
        
        System.out.println("My First number is :"+firstnum);
        
        
        // FOR DECIMAL 
        
        Scanner decimal =new Scanner(System.in); // input magxa 
        System.out.println("Enter second number :");
        double secondnum=scan.nextDouble(); //  checks if the entered is a decimal 
        
        System.out.println("My second number is :"+secondnum);
        
        
        // fro string 
        scan.nextLine(); // resolve buffer issue 
        Scanner word =new Scanner(System.in); // input magxa 
        System.out.println("Enter anything :");
        String name = scan.nextLine(); // yo matra lekhyo vane buffer issue aauxa when we take num and try to take a string   
        
        System.out.println("My word is :"+ name);
         
        
        // ternery operator 
        int a = 18;
        Scanner input = new Scanner (System.in);
        int age = input.nextInt();
        
        String canDrive = (age >= a) ? "driving is alowed ":"drivinng is not allowed ";
        System.out.println(canDrive);
        
        
        
        
    }
    
}