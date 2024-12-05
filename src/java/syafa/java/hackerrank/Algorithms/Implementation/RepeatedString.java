package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class RepeatedString
{
    static final String TARGET_CHARACTER = "a";
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int targetCharacterAmount = input.nextLine().replaceAll("[^" + TARGET_CHARACTER + "]","").length();
        input.close();
    }
}