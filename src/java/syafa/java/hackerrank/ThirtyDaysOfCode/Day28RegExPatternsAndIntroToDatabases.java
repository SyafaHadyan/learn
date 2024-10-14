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
            }
        }
        input.close();
        for (int i = 0; i < userData.size(); i++)
        {
            userData.set(i,userData.get(i).replaceAll(" +^[A-Z,a-z,0-9]+@gmail.com",null));
        }
    }
}