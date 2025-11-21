
/**
 * Write a description of class DataTypeInspector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeInspector
{
    public static void main (String[] args ){
        byte a=6;
        short b= 88; 
        int c= 584987;
        long d = 4397643l;
        float e= 6.6f;
        double f= 34567.4567;
        char g = 'L'; 
        boolean h = true;
        System.out.println("byte has 8 bit"+a);
        System.out.println("short has 16 bit"+b);
        System.out.println("int has 32 bit"+c);
        System.out.println("long has 64 bit"+d);
        System.out.println("float has 32 bit"+e);
        System.out.println("double has 64 bit"+f);
        System.out.println("char has 16 bit"+g);
        System.out.println("boolean is boolean"+h);
        
    }
}