package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.regex.*;

public class ApakahRiilPangram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char[] word = input.nextLine().replaceAll("\\W+","").toLowerCase().toCharArray();
        input.close();
        Arrays.sort(word);
        System.out.print(word);
    }
}