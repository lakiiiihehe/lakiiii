
/**
 * Write a description of class tutorial3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial3

{
    int arg;// instance variable 
    static int rtr; // static varible

    public static void main(String[] args)
    {
        int age= 18; // local variable
        System.out.println(age);
        
        // to print instance varible in static method
        // <class name><variable> = new<class name>;
        
        tutorial3 t1= new tutorial3();
        System.out.println(t1.arg);
        System.out.println(rtr);
        
        // Implicit Typecasting 
        
        double db= age;
        System.out.println();
        
        // Explict Type casting 
        double b= 12.34;
        int i= (int)b;
        System.out.println(i);
        
        long ab =455234567;
        int yu= (int)ab;
        System.out.println(yu);
        
        short st=10;
        short str=8;
        short sum= (short)(st+str); // int lai short ma store gareko 
        
        // max, min ,bit , byte 
        
        System.out.println("max, min ,@#$~!@#$%^&*()_+%bit , byte ");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        // uni code 
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.SIZE);
        System.out.println(Short.BYTES);
        
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.SIZE);
        System.out.println(Long.BYTES);
        
        
        
        
        
        
        
        
        
        
                                
        
        
        
        
        
    }
}
/**
 * Write a description of class tutorial3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial3
{
}