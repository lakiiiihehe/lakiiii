import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the total distance in km:");
    int distance= scan.nextInt();
    
    System.out.println("Enter the total ride time in minutes");
    int time= scan.nextInt();
    int fare = distance*time;
    
    System.out.println("Enter the time in hour (24 hr format) ");
    int nig = scan.nextInt();
    int nig_fare = (nig>18)?(fare+30):(fare+0);
    
    scan.nextLine();
    System.out.println("Is the customer a local? (yes or no) ");
    String l = scan.nextLine();
    
    System.out.println("\n");
    int final_fare = (l == "yes")?(nig_fare-44):(nig_fare-0);
    System.out.println("YOUR FINAL FARE IS : "+final_fare);
    
    
    
    
    
    
    
    
    
    
    
}
}