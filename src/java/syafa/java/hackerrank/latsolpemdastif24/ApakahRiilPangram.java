package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.regex.*;

public class ApakahRiilPangram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().replaceAll("\\W+","");
        input.close();
        System.out.print(word);
    }
}