import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Water Level in liters ");
        int level= scan.nextInt();
        String canDrive = (level >= 1000) ? "DANGER THE WATER LEVEL HAS INCREASED ":"Status: Normal";
        System.out.println(canDrive);
        
        
        
        
        
    }
}