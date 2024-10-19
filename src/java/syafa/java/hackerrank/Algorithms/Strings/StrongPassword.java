package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;
import java.util.stream.*;

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
        int passwordLength = Integer.parseInt(input.nextLine());
        String password = input.nextLine();
        input.close();
        String[] number = (String.valueOf("0123456789").split("//"));
        String specialCharacter = "!@#$%^&*()-+";
        boolean containLowerCase = false;
        boolean containUpperCase = false;
        for (int i = 0; i < password.length(); i++)
        {
            if (password.contains(number.charAt(i)))
            {

            }
        }
    }
}