import java.util.*;

public class JavaLoops02
{
    public static void main(String[] args)
    {
        /*
         * (a + b^c * d) * e
         */
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        input.nextLine();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();
        input.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.print(g);
    }
}