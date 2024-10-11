package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class BeautifulDaysAtTheMovies
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        ArrayList<Integer> firstLastDay = new ArrayList<Integer>();
        int validDay = 0;
        for (int i = 0; i < Integer.parseInt(days.get(0)) - Integer.parseInt(days.get(1)) + 1; i++)
        {
            firstLastDay.add(Integer.parseInt(days.get(0)) + i);
        }
        for (int i = 0; i < firstLastDay.size(); i++)
        {
            String reversedDay = "";
            for (int j = String.valueOf(firstLastDay.get(i)).length() - 1; j >= 0; j++)
            {
                reversedDay += days.get(i).charAt(j);
            }
            if (Math.floor(Math.abs(firstLastDay.get(i) - Integer.parseInt(reversedDay))) == Math.abs(Math.abs(firstLastDay.get(i) - Integer.parseInt(reversedDay))))
            {
                validDay++;
            }
        }
    }
}