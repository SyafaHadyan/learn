package syafa.java.section0;
import java.util.*;

public class ClassInstance
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int test_case = Integer.parseInt(input.nextLine());
        int age_array[] = new int[test_case];
        for (int i = 0; i < test_case; i++)
        {
            int age = Integer.parseInt(input.nextLine());
            age_array[i] = age;

        }
        for (int i = 0; i <= age_array.length - 1; i++)
        {
            int initial_age = age_array[i];
            initial_age = initial_age + age_array[i];
            for (int age_pass = 0; age_pass < 2; age_pass++)
            {
                if (initial_age < 0)
                {
                    System.out.println("Age is not valid, setting age to 0.");
                    initial_age = 0;
                }
                if (initial_age < 13)
                {
                    System.out.println("You are young.");
                    initial_age = initial_age + 3;
                }
                else if (initial_age >= 13 && initial_age < 18)
                {
                    System.out.println("You are a teenager.");
                    initial_age = initial_age + 3;
                }
                else
                {
                    System.out.println("You are old.");
                    initial_age = initial_age + 3;
                }
            }
            if (i != age_array.length - 1)
            {
                System.out.println();
            }
        }
        input.close();
    }
}