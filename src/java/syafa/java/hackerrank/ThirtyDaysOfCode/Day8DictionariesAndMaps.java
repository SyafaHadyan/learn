package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.Scanner;
import java.util.HashMap;

public class Day8DictionariesAndMaps
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int phoneBookSize = Integer.parseInt(input.nextLine());
        HashMap<String,Integer> phoneBook = new HashMap<String,Integer>();
        for (int i = 0; i < phoneBookSize; i++)
        {
            phoneBook.put(input.next(),input.nextInt());
        }
        input.nextLine();
        while (input.hasNextLine())
        {
            String temp = input.nextLine();
            if (phoneBook.containsKey(temp))
            {
                System.out.println(temp + "=" + phoneBook.get(temp));
                continue;
            }
            System.out.println("Not found");
        }
        input.close();
    }
}