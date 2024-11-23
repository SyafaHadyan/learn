package syafa.java.hackerrank.uappemrogramandasar2023tifa;
import java.util.*;

public class RankingPemain
{
    public static void sortRank (int[] playerOffensive,int[] playerDefensive)
    {
        for (int i = 0; i < playerOffensive.length; i++)
        {
            for (int j = 0; j < playerOffensive.length; j++)
            {
                if (playerOffensive[i] > playerOffensive[j])
                {
                    int tempSwap = playerOffensive[j];
                    playerOffensive[j] = playerOffensive[i];
                    playerOffensive[i] = tempSwap;
                }
                if (playerDefensive[i] > playerDefensive[j])
                {
                    int tempSwap = playerDefensive[j];
                    playerDefensive[j] = playerDefensive[i];
                    playerDefensive[i] = tempSwap;
                }
            }
        }
    }
    public static void showRank(int[] playerOffensiveOriginal,int[] playerDefensiveOriginal)
    {
        int[] playerOffensive = new int[playerDefensiveOriginal.length];
        int[] playerDefensive = new int[playerOffensiveOriginal.length];
        for (int i = 0; i < playerOffensive.length; i++)
        {
            playerOffensive[i] = playerOffensiveOriginal[i];
            playerDefensive[i] = playerDefensiveOriginal[i];
        }
        sortRank(playerOffensive,playerDefensive);
        System.out.print("Rank ofensif:");
        for (int i = 0; i < playerOffensive.length; i++)
        {
            for (int j = playerOffensive.length - 1; j >= 0; j--)
            {
                if (playerOffensive[j] == playerOffensiveOriginal[i])
                {
                    System.out.print(" " + (j + 1));
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int playerAmount = Integer.parseInt(input.nextLine());
        int[] playerOffensive = new int[playerAmount];
        int[] playerDefensive = new int[playerAmount];
        for (int i = 0; i < playerOffensive.length; i++)
        {
            playerOffensive[i] = input.nextInt();
        }
        input.nextLine();
        for (int i = 0; i < playerDefensive.length; i++)
        {
            playerDefensive[i] = input.nextInt();
        }
        input.nextLine();
        int managerInstructionAmount = Integer.parseInt(input.nextLine());
        String[] instructionList = new String[managerInstructionAmount];
        for (int i = 0; i < instructionList.length; i++)
        {
            instructionList[i] = input.nextLine();
            if (instructionList[i].equalsIgnoreCase("tampil rank"))
            {
                showRank(playerOffensive,playerDefensive);
            }
        }
        input.close();
    }
}