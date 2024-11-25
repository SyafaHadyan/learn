package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5AGameGulat
{
    public static int[] move(String move,int playerHealth,int monsterHealth)
    {
        if (move.equalsIgnoreCase("Punch"))
        {
            monsterHealth -= 30;
        }
        if (move.equalsIgnoreCase("Kick"))
        {
            monsterHealth -= (0.1d * (double) monsterHealth);
        }
        if (move.equalsIgnoreCase("Slam"))
        {
            monsterHealth -= 50;
            playerHealth -= 10;
        }
        return new int[]{playerHealth,monsterHealth};
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] playerData = {Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())};
        int moveAmount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < moveAmount; i++)
        {
            
        }
        input.close();
    }
}