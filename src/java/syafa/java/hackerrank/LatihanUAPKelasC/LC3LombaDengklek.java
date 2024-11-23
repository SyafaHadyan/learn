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
        String mostParticipant = "";
        String[] winningParticipant = new String[participantWinAmount];
        for (int i = 0; i < participantWinAmount; i++)
        {
            winningParticipant[i] = input.nextLine();
        }
        input.close();
        for (int i = 0; i < winningParticipant.length; i++)
        {
            for (int j = 1 + i; j < winningParticipant.length; j++)
            {
                //
            }
        }
    }
}