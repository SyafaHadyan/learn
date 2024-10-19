package syafa.java.hackerrank.certification.problemsolvingbasic;
import java.util.*;

public class ActiveTraders
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int customerAmount = Integer.parseInt(input.nextLine());
        int threshold = (int)Math.floor((5.0 / 100.0) * customerAmount);
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
            try
            {
                if (!(customer[i].equalsIgnoreCase(customer[i + 1])))
                {
                    counter = 0;
                }
                else
                {
                    counter++;
                }
                if (counter == threshold)
                {
                    activeCustomer.add(customer[i]);
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
        for (int i = 0; i < activeCustomer.size(); i++)
        {
            System.out.print(activeCustomer.get(i)); 
            if (activeCustomer.size() - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}