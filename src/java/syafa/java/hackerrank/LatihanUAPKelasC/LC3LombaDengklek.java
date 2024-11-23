package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3LombaDengklek
{
    static final int PARTICIPANT_AMOUNT = 4;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int participantWinAmount = Integer.parseInt(input.nextLine());
        int mostParticipantOccurence = 0;
        int currrentMostOccurence = 0;
        int previousMostOccurence = 0;
        int mostOccurence = 0;
        int duplicate = 0;
        String mostParticipant = "";
        String[] winningParticipant = new String[participantWinAmount];
        HashMap<String,Integer> participantList = new HashMap<>();
        ArrayList<Integer> occurence = new ArrayList<>();
        for (int i = 0; i < participantWinAmount; i++)
        {
            // winningParticipant[i] = input.nextLine();
            String tempInput = input.nextLine();
            if (participantList.get(tempInput) == null)
            {
                participantList.put(tempInput,1);
            }
            else if (participantList.containsKey(tempInput))
            {
                participantList.put(tempInput,participantList.get(tempInput) + 1);
            }
        }
        input.close();
        for (String string : participantList.keySet())
        {
            currrentMostOccurence = participantList.get(string);
            if (currrentMostOccurence > mostOccurence)
            {
                mostOccurence = currrentMostOccurence;
                mostParticipant = string;
            }
        }
        if (mostOccurence == 1)
        {
            System.out.println("Tidak ada kategori juara terbaik.");
            return;
        }
        System.out.println("Kategori juara terbaik diraih oleh" + " " + mostParticipant + ".");
    }
}