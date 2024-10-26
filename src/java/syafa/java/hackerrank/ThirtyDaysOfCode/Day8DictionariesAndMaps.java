package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day8DictionariesAndMaps
{
    public static void main(String[] args)
    {
        // TODO: Optimize the code
        Scanner input = new Scanner(System.in);
        int phoneBookSize = Integer.parseInt(input.nextLine());
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        for (int i = 0; i < phoneBookSize; i++)
        {
            phoneBook.put(input.next(),Integer.parseInt(input.next()));
            input.nextLine();
        }
        input.close();
        for (int i = 0; i < phoneBook.size(); i++)
        {
            System.out.print(phoneBook.get(input.nextLine()));
        }
        /*
        int phoneBookInput = Integer.parseInt(input.nextLine());
        String nameArray[] = new String[phoneBookInput];
        int phoneNumberArray[] = new int[phoneBookInput];
        String result[] = new String[phoneBookInput];
        String name = "";
        int phoneNumber = 0;
        for (int i = 0; i < phoneBookInput; i++)
        {
            name = input.next();
            nameArray[i] = name;
            phoneNumber = input.nextInt();
            phoneNumberArray[i] = phoneNumber;
            input.nextLine();
        }
        for (int i = 0; i < phoneBookInput; i++)
        {
            String searchName = input.nextLine();
            result[i] = searchName + "=" + phoneNumberArray[i];
            if (!Arrays.stream(nameArray).anyMatch(searchName::equals))
            {
                result[i] = "Not found";
            }
        }
        input.close();
        for (int i = 0; i < phoneBookInput; i++)
        {
            System.out.println(result[i]);
        }
        */
    }
}