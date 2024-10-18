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
                "ke arah utara sebanyak" +
                Integer.parseInt(String.valueOf(step.charAt(i)) + String.valueOf(step.charAt(i + 1)))
                i += 2;
                counter++;
            }
            else if (step.charAt(i) == 'S')
            {
                result[counter] =
                "ke arah selatan sebanyak" +
                Integer.parseInt(String.valueOf(step.charAt(i + 1))) + 
                Integer.parseInt(String.valueOf(step.charAt(i + 2)));
                i += 2;
                counter++;
            }
            else if (step.charAt(i) == 'B')
            {
                result[counter] =
                "ke arah barat sebanyak" +
                Integer.parseInt(String.valueOf(step.charAt(i + 1))) + 
                Integer.parseInt(String.valueOf(step.charAt(i + 2)));
                i += 2;
                counter++;
            }
            else if (step.charAt(i) == 'T')
            {
                result[counter] =
                "ke arah timur sebanyak" +
                Integer.parseInt(String.valueOf(step.charAt(i + 1))) + 
                Integer.parseInt(String.valueOf(step.charAt(i + 2)));
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
        /*
         * 0 1 2 3 4 5 6 7 8 9 10
         * U 0 5 U 1 0 B 0 5 B 10
         * 
         * Pak Dengklek akan berjalan ke arah utara sebanyak 5 langkah, ke arah utara sebanyak 10 langkah, ke arah barat sebanyak 5 langkah, ke arah barat sebanyak 10 langkah.
         */
    }
}