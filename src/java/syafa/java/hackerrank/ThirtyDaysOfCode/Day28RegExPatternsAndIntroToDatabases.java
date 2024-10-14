package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day28RegExPatternsAndIntroToDatabases
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataSize = Integer.parseInt(input.nextLine());
        ArrayList<String> userData = new ArrayList<>();
        for (int i = 0; i < dataSize; i++)
        {
            userData.add(input.nextLine());
        }
        input.close();
    }
}