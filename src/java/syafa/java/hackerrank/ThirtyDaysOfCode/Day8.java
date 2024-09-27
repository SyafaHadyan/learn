package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;
public class Day8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
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
            result[i] = searchName;
            try
            {
                result[i] = searchName + "=" + phoneNumberArray[i];
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                result[i] = "Not found";
            }
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
    }
}