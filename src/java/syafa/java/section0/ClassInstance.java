package syafa.java.section0;
import java.util.*;

public class ClassInstance
{
    class age
    {
        if (age < 13)
        {
            System.out.println("You are young.");
        }
        else if (age >= 13 && age < 18)
        {
            System.out.println("You are a teenager.");
        }
        else
        {
            System.out.println("You are old.");
        }
    }
    public static void main(String[] args)
    {
        boolean user_input = true;
        Scanner input = new Scanner(System.in);
        int age = 0;
        int test_case = Integer.parseInt(input.nextLine());
        age = Integer.parseInt(input.nextLine());
        int initial_age = 0;
        for (int i = 0; i <= test_case; i++)
        {
            if (age <= 0)
            {
                System.out.println("Age is not valid, setting age to 0.");
                System.out.println("");
                user_input = true;
            }
            else
            {
                System.out.println();
            }
        }
    }
}
