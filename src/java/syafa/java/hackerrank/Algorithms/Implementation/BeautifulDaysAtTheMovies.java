package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class BeautifulDaysAtTheMovies
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        ArrayList<Double> firstLastDay = new ArrayList<Double>();
        int validDay = 0;
        for (int i = 0; i < Integer.parseInt(days.get(1)) - Integer.parseInt(days.get(0)) + 1; i++)
        {
            firstLastDay.add(Double.parseDouble(days.get(0)) + i);
        }
        for (int i = 0; i < firstLastDay.size(); i++)
        {
            String reversedDay = "";
            for (int j = String.valueOf(firstLastDay.get(i)).length() - 1; j >= 0; j--)
            {
                reversedDay += String.valueOf(firstLastDay.get(i)).charAt(j);
            }
            if (Math.floor(Math.abs(firstLastDay.get(i) - Double.parseDouble(reversedDay)) / Double.parseDouble(days.get(2))) == (Math.abs(firstLastDay.get(i) - Integer.parseInt(reversedDay)) / Integer.parseInt(days.get(2))))
            {
                validDay++;
            }
            if (i == firstLastDay.size() - 1)
            {
                System.out.print(validDay);
                return;
            }
        }
    }
}