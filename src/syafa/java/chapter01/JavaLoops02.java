import java.util.*;

public class JavaLoops02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for (int i = 0; i < q; i++)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            series(a, b, n);
        }
        
        input.close();
    }
    
    private static void series(int a, int b, int n)
    {
        int current = a;
        for (int i = 0; i < n; i++) {
            current = current + (int) Math.pow(2, i) * b;
            System.out.print(current + " ");
        }
        System.out.println();
    }
}