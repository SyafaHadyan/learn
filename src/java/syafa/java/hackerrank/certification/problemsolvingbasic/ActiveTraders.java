package syafa.java.hackerrank.certification.problemsolvingbasic;
import java.util.*;

public class ActiveTraders
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int customerAmount = Integer.parseInt(input.nextLine());
        String[] customer = new String[customerAmount];
        for (int i = 0; i < customerAmount; i++)
        {
            customer[i] = input.nextLine();
        }
        input.close();
    }
}