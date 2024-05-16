import static java.lang.System.out;
import static java.lang.Math.*;
public class Static {
    public static void main(String args[])
    {
        //instead of Math.sqrt need to use only sqrt
        double variable1= sqrt(6.0);
        //instead of Math.tan need to use only tan
        double variable2= tan(20);
        //need not to use System in both the below statements
        out.println("Square of 5 is:"+variable1);
        out.println("Tan of 30 is:"+variable2);
    }
}

