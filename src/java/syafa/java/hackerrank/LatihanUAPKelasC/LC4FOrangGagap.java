package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4FOrangGagap
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] word = input.nextLine().split("");
        input.close();
        String spell = "";
        for (int i = 0; i < word.length; i++)
        {
            System.err.println(word[i]);
            spell = spell.concat(word[i]);
            System.out.print(spell);
        }
        System.err.println();
    }
}