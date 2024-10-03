package syafa.java.hackerrank.DataStructures;
import java.util.*;

public class JavaList
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int initialArrayLength = Integer.parseInt(input.nextLine());
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        for (int i = 0; i < initialArrayLength; i++)
        {
            numberArray.add(input.nextInt());
        }
        String operation = input.nextLine();
        if (operation.equalsIgnoreCase("Insert"))
        {
            //
        }
        else if (operation.equalsIgnoreCase("Delete"))
        {
            //
        }
    }
}