package syafa.java.hackerrank.DataStructures;
import java.util.*;

public class JavaList
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int indexAt = 0;
        int numberOfOperations = 0;
        String operation = "";
        int initialArrayLength = Integer.parseInt(input.nextLine());
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        for (int i = 0; i < initialArrayLength; i++)
        {
            numberArray.add(input.nextInt());
        }
        input.nextLine();
        numberOfOperations = Integer.parseInt(input.nextLine());
        for (int i = 0; i < numberOfOperations; i++)
        {
            operation = input.nextLine();
            if (operation.equalsIgnoreCase("Insert"))
            {
                indexAt = input.nextInt();
                numberArray.add(indexAt, input.nextInt());
                input.nextLine();
            }
            else if (operation.equalsIgnoreCase("Delete"))
            {
                indexAt = input.nextInt();
                numberArray.remove(indexAt);
                input.nextLine();
            }
        }
        input.close();
        for (int i = 0; i < numberArray.size(); i++)
        {
            System.out.print(numberArray.get(i));
            if (i < numberArray.size() - 1)
            {
                System.out.print(' ');
            }
        }
    }
}