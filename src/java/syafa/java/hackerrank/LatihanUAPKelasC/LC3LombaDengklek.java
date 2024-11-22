package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3LombaDengklek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int participantAmount = Integer.parseInt(input.nextLine());
        HashMap<String,Integer> participantWinAmount = new HashMap<>();
        for (int i = 0; i < participantAmount; i++)
        {
            String tempInput = input.nextLine();
            if (participantWinAmount.get(tempInput) == null)
            {
                participantWinAmount.put(tempInput,1);
                continue;
            }
            participantWinAmount.merge(tempInput,1,Integer::sum);
        }
        input.close();
    }
}