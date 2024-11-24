package syafa.java.hackerrank.certification.problemsolvingbasic;
import java.util.*;

public class ActiveTraders
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int traderAmount = Integer.parseInt(input.nextLine());
        HashMap<String,Integer> traderList = new HashMap<>();
        for (int i = 0; i < traderAmount; i++)
        {
            String tempInput = input.nextLine();
            if (traderList.containsKey(tempInput))
            {
                traderList.merge(tempInput,1,Integer::sum);
            }
            else
            {
                traderList.put(tempInput,1);
            }
        }
        input.close();
    }
}