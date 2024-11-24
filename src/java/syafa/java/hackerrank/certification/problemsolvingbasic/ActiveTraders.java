package syafa.java.hackerrank.certification.problemsolvingbasic;
import java.util.*;

public class ActiveTraders
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int traderAmount = Integer.parseInt(input.nextLine());
        String[] traderListRaw = new String[traderAmount];
        HashMap<String,Integer> traderList = new HashMap<>();
        for (int i = 0; i < traderAmount; i++)
        {
            traderListRaw[i] = input.nextLine();
        }
        input.close();
        Arrays.sort(traderListRaw);
        for (int i = 0; i < traderAmount; i++)
        {
            if (traderList.containsKey(traderListRaw[i]))
            {
                traderList.merge(traderListRaw[i],1,Integer::sum);
            }
            else
            {
                traderList.put(traderListRaw[i],1);
            }
        }
    }
}