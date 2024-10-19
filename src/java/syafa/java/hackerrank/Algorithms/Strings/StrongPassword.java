package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class StrongPassword
{
    public static void main(String[] args)
    {
        /*
         * numbers = "0123456789"
         * lower_case = "abcdefghijklmnopqrstuvwxyz"
         * upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
         * special_characters = "!@#$%^&*()-+"
         * 
         * 2bbbbb
         * This password is 5 characters long and is missing an uppercase and a special character. The minimum number of characters to add is 2.
         * 
         * 2bb#A
         * is password is 5 characters long and has at least one of each character type. The minimum number of characters to add is 1.
         * 
         * passwordLength
         * password
         * 
         * minimumCharToAdd
         * 
         * 3
         * Ab1
         * 
         * 3
         * 
         * 
         * 11
         * #HackerRank
         * 
         * 1
         */
        Scanner input = new Scanner(System.in);
        //int passwordLength = Integer.parseInt(input.nextLine());
        String password = input.nextLine();
        input.close();
        //String[] number = (String.valueOf("0123456789").split("//"));
        String[] specialCharacter = "!@#$%^&*()-+".split("");
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
                if (password.equalsIgnoreCase(specialCharacter[j]))
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
        if ((password.length() < 6) && (6 - password.length() < requiredCharacter))
        {
            requiredCharacter = 6 - password.length();
        }
        System.out.print(requiredCharacter);
    }
}