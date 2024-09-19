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
        series(a, b, c, d);
        series(e, f, g, 0);
    }
    private static void series(int a, int b, int c, int d)
    {
        int n = d;
        int current = a;
        for (int i = 0; i < n; i++) {
            current = current + (int) Math.pow(2, i) * b;
            System.out.print(current + " ");
        }
        System.out.println();
    }
}