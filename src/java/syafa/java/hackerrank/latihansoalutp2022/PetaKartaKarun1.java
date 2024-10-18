package syafa.java.hackerrank.latihansoalutp2022;
import java.util.*;

public class PetaKartaKarun1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String step = input.nextLine();
        input.close();
        int counter = 0;
        String[] result = new String[4];
        for (int i = 0; i < step.length(); i++)
        {
            if (step.charAt(i) == 'U')
            {
                result[counter] =
                "ke arah utara sebanyak " +
                Integer.parseInt(String.valueOf(step.charAt(i + 1)) + String.valueOf(step.charAt(i + 2)));
                i += 2;
                counter++;
            }
            else if (step.charAt(i) == 'S')
            {
                result[counter] =
                "ke arah selatan sebanyak " +
                Integer.parseInt(String.valueOf(step.charAt(i + 1)) + String.valueOf(step.charAt(i + 2)));
                i += 2;
                counter++;
            }
            else if (step.charAt(i) == 'B')
            {
                result[counter] =
                "ke arah barat sebanyak " +
                Integer.parseInt(String.valueOf(step.charAt(i + 1)) + String.valueOf(step.charAt(i + 2)));
                i += 2;
                counter++;
            }
            else if (step.charAt(i) == 'T')
            {
                result[counter] =
                "ke arah timur sebanyak " +
                Integer.parseInt(String.valueOf(step.charAt(i + 1)) + String.valueOf(step.charAt(i + 2)));
                i += 2;
                counter++;
            }
        }
        System.out.print("Pak Dengklek akan berjalan ");
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
            System.out.print(" langkah");
            if (result.length - i != 1)
            {
                System.out.print(", ");
                continue;
            }
            System.out.print('.');
        }
    }
}