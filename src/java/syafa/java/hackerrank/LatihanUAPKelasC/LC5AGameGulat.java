package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5AGameGulat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int monsterHealth = Integer.parseInt(input.nextLine());
        int playerHealth = Integer.parseInt(input.nextLine());
        int moveAmount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < moveAmount; i++)
        {
            String tempInput = input.nextLine();
            if (tempInput.equalsIgnoreCase("Punch"))
            {
                monsterHealth -= 30;
            }
            if (tempInput.equalsIgnoreCase("Kick"))
            {
                monsterHealth -= (0.1d * (double) monsterHealth);
            }
            if (tempInput.equalsIgnoreCase("Slam"))
            {
                monsterHealth -= 50;
                playerHealth -= 10;
            }
        }
        input.close();
    }
}