
/**
 * Write a description of class Defaultvalue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Defaultvalue
{
    byte a;
    short b;
    int c;
    long d;
    float e; 
    double f;
    boolean g;
    char h;
    

    public static void main(String[] args){
        Defaultvalue a1= new Defaultvalue();
        System.out.println(a1.a);                 
        //int a;
        // this will not work as it is a local variable int a=0 or 5; would work
        System.out.println(a1.b);
        System.out.println(a1.c);
        System.out.println(a1.d);
        System.out.println(a1.e);
        System.out.println(a1.f);
        System.out.println(a1.g);
        System.out.println(a1.h);
        
        
        
        
    }
    
}