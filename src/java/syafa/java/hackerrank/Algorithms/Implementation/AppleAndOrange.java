package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class AppleAndOrange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> houseDomain = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> treePosition = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> fruitCount = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> appleFallPosition = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> orangeFallPosition = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        int appleFallRegion = 0;
        int orangeFallRegion = 0;
        for (int i = 0; i < Integer.parseInt(fruitCount.get(0)); i++)
        {
            if (Integer.parseInt(treePosition.get(0)) + Integer.parseInt(appleFallPosition.get(i)) >= Integer.parseInt(houseDomain.get(0)) &&
            Integer.parseInt(treePosition.get(0)) + Integer.parseInt(appleFallPosition.get(i)) >= Integer.parseInt(houseDomain.get(1)))
            {

            }
        }
    }
}