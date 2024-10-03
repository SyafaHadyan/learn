package syafa.java.hackerrank.DataStructures;
import java.util.*;

public class JavaList
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int indexAt = 0;
        int operationInput = 0;
        int initialArrayLength = Integer.parseInt(input.nextLine());
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        for (int i = 0; i < initialArrayLength; i++)
        {
            numberArray.add(Integer.parseInt(input.nextLine()));
        }
        String operation = input.nextLine();
        if (operation.equalsIgnoreCase("Insert"))
        {
            indexAt = input.nextInt();
            numberArray.add(Integer.parseInt(input.nextLine()));
        }
        else if (operation.equalsIgnoreCase("Delete"))
        {
            //
        }
    }
}