package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day15LinkedList
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int nodes = Integer.parseInt(input.nextLine());
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < nodes; i++)
        {
            data.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
    }
}