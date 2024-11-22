package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3LombaDengklek
{
    static final int PARTICIPANT_AMOUNT = 4;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int participantWinAmount = Integer.parseInt(input.nextLine());
        int mostOccurence = 1;
        String[] winningParticipant = new String[participantWinAmount];
        String[][] participantList = new String[PARTICIPANT_AMOUNT][2];
        for (int i = 0; i < participantWinAmount; i++)
        {
            winningParticipant[i] = input.nextLine();
        }
        input.close();
        for (int i = 0; i < participantList.length; i++)
        {
            for (int j = 0 + i; j < winningParticipant.length; j++)
            {
                if (!(winningParticipant[j].equalsIgnoreCase(participantList[i][0])))
                {
                    participantList[i][0] = winningParticipant[j];
                }
            }
        }
        System.out.println(Arrays.toString(participantList));
        for (int i = 0; i < winningParticipant.length; i++)
        {
            for (int j = 0 + i; j < participantList.length; j++)
            {
                if (winningParticipant[i].equalsIgnoreCase(participantList[j][0]))
                {
                    int currentOccurence = Integer.parseInt(participantList[j][1] + 1);
                    participantList[j][1] = String.valueOf(currentOccurence);
                    if (currentOccurence > mostOccurence)
                    {
                        mostOccurence = currentOccurence;
                    }
                    continue;
                }
            }
        }
    }
}