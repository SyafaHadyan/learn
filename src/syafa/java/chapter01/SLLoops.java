import java.util.Scanner;

public class SLLoops
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int sum = 0;
        input.close();
        for (int i = 1; i <= number; i++)
        {
            sum = sum + i;
        }
        System.out.print(sum);
    }

}