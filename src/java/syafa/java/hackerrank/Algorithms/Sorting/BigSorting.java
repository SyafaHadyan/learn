package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;

public class BigSorting
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < arraySize; i++)
        {
            numbers.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
    }
}