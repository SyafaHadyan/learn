package syafa.java.section0;
import java.util.*;

public class ClassInstance
{
    static void age_check()
    {
        Scanner input = new Scanner(System.in);
        int age = Integer.parseInt(input.nextLine());
        //input.close();
        if (age < 0)
        {
            System.out.println("Age is not valid, setting age to 0.");
        }
        else if (age < 13)
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
        int test_case = Integer.parseInt(input.nextLine());
        int initial_age_array[] = new int[test_case];
        //input.close();
        for (int i = 0; i < test_case; i++)
        {
            int age = Integer.parseInt(input.nextLine());
        }
        System.out.println(initial_age_array.length);
    }
}