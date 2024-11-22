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
        int occurence = 1;
        String mostParticipant = "";
        String[] winningParticipant = new String[participantWinAmount];
        String[][] participantList = new String[PARTICIPANT_AMOUNT][2];
        for (int i = 0; i < participantWinAmount; i++)
        {
            winningParticipant[i] = input.nextLine();
        }
        input.close();
        int index = 0;
        for (int i = 0; i < participantList.length; i++)
        {
            for (int j = 0; j < winningParticipant.length; j++)
            {
                if (!(winningParticipant[j].equalsIgnoreCase(participantList[i][0])) && participantList[i] != null && index < participantList.length)
                {
                    participantList[index][0] = winningParticipant[j];
                    participantList[index][1] = String.valueOf(1);
                    index++;
                }
                else if (winningParticipant[j].equalsIgnoreCase(participantList[i][0]))
                {
                    int currentOccurence = Integer.parseInt(participantList[i][1]) + 1;
                    participantList[i][1] = String.valueOf(currentOccurence);
                    if (currentOccurence > mostOccurence)
                    {
                        mostOccurence = currentOccurence;
                        mostParticipant = participantList[i][0];
                    }
                    else if (mostOccurence == currentOccurence)
                    {
                        occurence++;
                    }
                }
            }
        }
        System.err.println(occurence);
        System.err.println(mostParticipant);
        System.err.println(mostOccurence);
        if (winningParticipant.length % PARTICIPANT_AMOUNT == 0 || occurence == PARTICIPANT_AMOUNT)
        {
            System.out.println("Tidak ada kategori juara terbaik.");
        }
        else if (mostOccurence != 1)
        {
            System.out.println("Kategori juara terbaik diraih oleh " + mostParticipant + ".");
        }
        // for (int i = 0; i < winningParticipant.length; i++)
        // {
        //     for (int j = 0 + i; j < participantList.length; j++)
        //     {
        //         if (winningParticipant[i].equalsIgnoreCase(participantList[j][0]))
        //         {
        //             int currentOccurence = Integer.parseInt(participantList[j][1] + 1);
        //             participantList[j][1] = String.valueOf(currentOccurence);
        //             if (currentOccurence > mostOccurence)
        //             {
        //                 mostOccurence = currentOccurence;
        //             }
        //             continue;
        //         }
        //     }
        // }
    }
}