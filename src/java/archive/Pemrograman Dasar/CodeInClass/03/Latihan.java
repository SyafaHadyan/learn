import java.util.*;

@SuppressWarnings("unused")
public class Latihan
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 6;
        int z = 25;

        x *= 5 + y;
        y += y &= x;
        z += x>>2 & y<<1;
        
        System.out.printf("x = %d\ny = %d\nz = %d\n",x,y,z);

        /*
         * Output:
         * 
         * x = 110
         * y = 12
         * z = 49
         * 
         */
    }
}