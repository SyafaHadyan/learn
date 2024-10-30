package syafa.java.hackerrank.LiveCodingTIFABAB4;
import java.util.*;

public class Perulangan
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
            if (word.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}