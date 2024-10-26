package syafa.java.hackerrank.DataStructures.LinkedLists;
import java.util.*;

public class InsertNodeTailLinkedList
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataAmount = Integer.parseInt(input.nextLine());
        LinkedList<Integer> data = new LinkedList<>();
        for (int i = 0; i < dataAmount; i++)
        {
            data.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
        for (int i = 0; i < data.size(); i++)
        {
            System.out.print(data.get(i));
            if (data.size() - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}