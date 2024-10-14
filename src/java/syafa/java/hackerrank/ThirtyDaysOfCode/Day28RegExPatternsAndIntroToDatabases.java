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
            if (!(userData.get(i).contains("@gmail.com")))
            {
                userData.remove(i);
                i--;
                dataSize--;
            }
        }
        input.close();
        for (int i = 0; i < userData.size(); i++)
        {
            userData.set(i,userData.get(i).replaceAll("\s*[A-Za-z0-9]+@gmail.com",""));
        }
        Collections.sort(userData);
        for (int i = 0; i < userData.size(); i++)
        {
            System.out.print(userData.get(i));
            if (i - userData.size() - 1 != 0)
            {
                System.out.print("\n");
            }
        }
    }
}