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
        ArrayList<String> fruitFallPositon = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
    }
}