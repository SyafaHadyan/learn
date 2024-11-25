package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4FOrangGagap
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char[] word = input.nextLine().toCharArray();
        input.close();
        StringBuilder spell = new StringBuilder();
        for (int i = 0; i < word.length; i++)
        {
            spell.append(word[i]);
            System.out.print(spell);
        }
    }
}