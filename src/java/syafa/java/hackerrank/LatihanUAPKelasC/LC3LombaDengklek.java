package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3LombaDengklek
{
    static final int PARTICIPANT_AMOUNT = 4;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int participantWinAmount = Integer.parseInt(input.nextLine());
        String[] winningParticipant = new String[participantWinAmount];
        String[] participantList = new String[PARTICIPANT_AMOUNT];
        for (int i = 0; i < participantWinAmount; i++)
        {
            winningParticipant[i] = input.nextLine();
        }
        input.close();
        for (int i = 0; i < winningParticipant.length; i++)
        {
            //
        }
    }
}