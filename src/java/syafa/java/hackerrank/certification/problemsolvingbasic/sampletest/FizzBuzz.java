package syafa.java.hackerrank.certification.problemsolvingbasic.sampletest;
import java.util.*;

public class FizzBuzz
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = 1; i <= number; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                System.out.print("FizzBuzz");
            }
            else if ((i % 3 == 0 ) && (i % 5 != 0))
            {
                System.out.print("Fizz");
            }
            else if ((i % 3 != 0) && (i % 5 == 0))
            {
                System.out.print("Buzz");
            }
            else if ((i % 3 != 0) && (i % 5 != 0))
            {
                System.out.print(i);
            }
            if (number != i)
            {
                System.out.print("\n");
            }
        }
    }
}