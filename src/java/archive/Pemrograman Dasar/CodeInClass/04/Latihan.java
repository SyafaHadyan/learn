import java.util.*;

@SuppressWarnings("unused")
public class Latihan
{
    public static void main(String[] args)
    {
        double x;

        x = 7/2;
        System.out.printf("x = %f\n",x);
        x = 7.0/2;
        System.out.printf("x = %f\n",x);
        x = 7/2.0;
        System.out.printf("x = %f\n",x);
        x = 7.0/2.0;
        System.out.printf("x = %f\n",x);
        x = (float)7/2;
        System.out.printf("x = %f\n",x);

        /*
         * Output:
         * 
         * x = 3.000000
         * x = 3.500000
         * x = 3.500000
         * x = 3.500000
         * x = 3.500000
         * 
         */ 
    }
}