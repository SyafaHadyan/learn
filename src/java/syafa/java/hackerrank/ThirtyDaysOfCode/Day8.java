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
        String output = "";
        String finalOutput = "";
        for (int i = 0; i < phoneBookInput; i++)
        {
            String name = input.next();
            nameArray[i] = name;
            int phoneNumber = input.nextInt();
            phoneNumberArray[i] = phoneNumber;
            input.nextLine();
        }
        for (int i = 0; i < phoneBookInput; i++)
        {
            String searchName = input.nextLine();
            int nameMatch = Arrays.asList(nameArray).indexOf(searchName);
            int phoneNumberMatch = Arrays.asList(phoneNumberArray).indexOf(nameMatch);
            if (i > 0)
            {
                output = nameArray[nameMatch];
                finalOutput = nameArray[nameMatch];
            }
            else if (i > 0)
            {
                finalOutput = output + "\n" + nameArray[nameMatch];
            }
        }
        System.out.print(finalOutput);
    }
}