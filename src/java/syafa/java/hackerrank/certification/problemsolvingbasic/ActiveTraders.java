package syafa.java.hackerrank.certification.problemsolvingbasic;
import java.util.*;

public class ActiveTraders
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int customerAmount = Integer.parseInt(input.nextLine());
        int threshold = Integer.parseInt(String.valueOf(Math.floor((5.0 / 100.0) * customerAmount)));
        int counter = 0;
        String[] customer = new String[customerAmount];
        ArrayList<String> activeCustomer = new ArrayList<>();
        for (int i = 0; i < customerAmount; i++)
        {
            customer[i] = input.nextLine();
        }
        Arrays.sort(customer);
        input.close();
        for (int i = 0; i < customerAmount; i++)
        {
            if (customer[i].equalsIgnoreCase(customer[i + 1]))
            {
                counter++;
            }
            else if (!(customer[i].equalsIgnoreCase(customer[i + 1])))
            {
                counter = 0;
            }
            if (counter == 5)
            {
                activeCustomer.add(customer[i]);
            }
        }
    }
}