package syafa.java.hackerrank.OneWeekPreparationKit.Day2;
import java.util.*;

public class LonelyInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //int arraySize = Integer.parseInt(input.nextLine());
        ArrayList<String> arrayString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        ArrayList<Integer> arrayInteger = new ArrayList<Integer>();
        for (int i = 0; i < arrayString.size(); i++)
        {
            arrayInteger.add(Integer.parseInt(arrayString.get(i)));
        }
        //Collections.sort(arrayInteger);
        for (int i = 0; i < arrayInteger.size(); i++)
        {
            //if (arrayInteger.get(i)).equals(arrayInteger.get(i + 1));
        }
    }
}