package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class StrongPassword
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        String password = input.nextLine();
        input.close();
        char[] specialCharacter = "!@#$%^&*()-+".toCharArray();
        boolean containNumber = false;
        boolean containSpecialCharacter = false;
        boolean containLowerCase = false;
        boolean containUpperCase = false;
        int requiredCharacter = 0;
        for (int i = 0; i < password.length(); i++)
        {
            if (Character.isUpperCase(password.charAt(i)))
            {
                containUpperCase = true;
            }
            if (Character.isLowerCase(password.charAt(i)))
            {
                containLowerCase = true;
            }
            if (Character.isDigit(password.charAt(i)))
            {
                containNumber = true;
            }
        }
        for (int i = 0; i < password.length(); i++)
        {
            for (int j = 0; j < specialCharacter.length; j++)
            {
                if (password.charAt(i) == (specialCharacter[j]))
                {
                    containSpecialCharacter = true;
                    break;
                }
            }
        }
        if (!containNumber)
        {
            requiredCharacter++;
        }
        if (!containSpecialCharacter)
        {
            requiredCharacter++;
        }
        if (!containLowerCase)
        {
            requiredCharacter++;
        }
        if (!containUpperCase)
        {
            requiredCharacter++;
        }
        if ((password.length() < 6) && (6 - password.length() > requiredCharacter))
        {
            requiredCharacter = 6 - password.length();
        }
        System.out.print(requiredCharacter);
    }
}