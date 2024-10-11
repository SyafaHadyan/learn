package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class BeautifulDaysAtTheMovies
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        for (int i = Integer.parseInt(days.get(0)); i <= Integer.parseInt(days.get(1)) + 1; i++)
        {
            StringBuilder reverseDay = new StringBuilder(days.get(i));
        }
    }
}