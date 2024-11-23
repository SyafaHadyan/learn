package syafa.java.hackerrank.uappemrogramandasar2023tifa;
import java.util.*;

public class RankingPemain
{
    public static void showRankSorted (int[] original,int[] sorted)
    {
        for (int i = 0; i < original.length; i++)
        {
            for (int j = original.length - 1; j >= 0; j--)
            {
                System.err.print("");
                if (sorted[j] == original[i])
                {
                    while (j != 0 && sorted[j - 1] == sorted[j])
                    {
                        j--;
                    }
                    System.out.print(" " + (j + 1));
                    break;
                }
            }
        }
        System.out.print("\n");
    }
    public static void sortRank (int[] playerOffensive,int[] playerDefensive,int[] overallRank)
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
                if (overallRank[i] > overallRank[j])
                {
                    int tempSwap = overallRank[j];
                    overallRank[j] = overallRank[i];
                    overallRank[i] = tempSwap;
                }
            }
        }
    }
    public static void instruction(int[] playerOffensiveOriginal,int[] playerDefensiveOriginal,String showOverall)
    {
        int[] playerOffensive = new int[playerDefensiveOriginal.length];
        int[] playerDefensive = new int[playerOffensiveOriginal.length];
        int[] overallRankOriginal = new int[playerOffensiveOriginal.length];
        int[] overallRank = new int[playerOffensiveOriginal.length];
        for (int i = 0; i < playerOffensive.length; i++)
        {
            playerOffensive[i] = playerOffensiveOriginal[i];
            playerDefensive[i] = playerDefensiveOriginal[i];
            overallRankOriginal[i] = playerOffensive[i] + playerDefensive[i];
            overallRank[i] = playerOffensive[i] + playerDefensive[i];
        }
        sortRank(playerOffensive,playerDefensive,overallRank);
        System.out.print("Rank ofensif:"); showRankSorted(playerOffensiveOriginal,playerOffensive);
        System.out.print("Rank defensif:"); showRankSorted(playerDefensiveOriginal,playerDefensive);
        if (showOverall.equalsIgnoreCase("rank"))
        {
            System.out.print("Rank overall:"); showRankSorted(overallRankOriginal,overallRank);
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
        for (int i = 0; i < managerInstructionAmount; i++)
        {
            String[] tempInput = input.nextLine().split("\s");
            if (tempInput[0].equalsIgnoreCase("tampil"))
            {
                instruction(playerOffensive,playerDefensive,tempInput[1]);
            }
        }
        input.close();
    }
}