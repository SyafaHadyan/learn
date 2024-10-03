package syafa.java.hackerrank.DataStructures;
import java.util.*;

public class JavaList
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int indexAt = 0;
        int operationInput = 0;
        int numberOfOperations = 0;
        String operation = "";
        int initialArrayLength = Integer.parseInt(input.nextLine());
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        for (int i = 0; i < initialArrayLength; i++)
        {
            numberArray.add(input.nextInt());
        }
        numberOfOperations = Integer.parseInt(input.nextLine());
        operation = input.nextLine();
        for (int i = 0; i < args.length; i++)
        {
            if (operation.equalsIgnoreCase("Insert"))
            {
                indexAt = input.nextInt();
                numberArray.add(indexAt, Integer.parseInt(input.nextLine()));
            }
            else if (operation.equalsIgnoreCase("Delete"))
            {
                //
            }
        }
        input.close();
    }
}