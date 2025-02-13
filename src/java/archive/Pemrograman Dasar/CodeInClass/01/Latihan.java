import java.util.*;

@SuppressWarnings("unused")
public class Latihan 
{
    public static void main(String[] args)
    {
        int a_0;
        int a_1;
        int a_2;
        int a_3;
        int a_4;
        int b = 23;
        int c = 12;
        int d = 32;
        @SuppressWarnings("unused")
        int e = 0;

        //a = b&&e; // Error
        a_0 = b & c; // 4
        //a = c || d; // Error
        a_1 = b | d; // 55
        //a = b > 2; // Error
        a_2 = b >> 2; // 5
        //a = c < 3; // Error
        a_3 = c << 3; // 96
        a_4 = b = c; // 12
        //a = b == c; // Error

        System.out.println(a_0);
        System.out.println(a_1);
        System.out.println(a_2);
        System.out.println(a_3);
        System.out.println(a_4);

        /*
         * Output:
         * 
         * 4
         * 55
         * 5
         * 96
         * 12
         * 
         */
    }
}