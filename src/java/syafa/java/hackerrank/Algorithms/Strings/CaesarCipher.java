package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class CaesarCipher
{
    static class cipher
    {
        public static char characterIndex(char character,int rotation)
        {
            if (Character.isUpperCase(character))
            {
                character = Character.toLowerCase(character);
            }
            char[] characterIndex = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            while ((new String(characterIndex).indexOf(character) + rotation) > 25)
            {
                rotation -= 26;
            }
            return characterIndex[(new String(characterIndex).indexOf(character) + rotation)];
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        char[] originalLetter = input.nextLine().toCharArray();
        int rotation = Integer.parseInt(input.nextLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < originalLetter.length; i++)
        {
            if (!(Character.isAlphabetic(originalLetter[i])))
            {
                result.append(originalLetter[i]);
                continue;
            }
            if (Character.isUpperCase(originalLetter[i]))
            {
                result.append(Character.toUpperCase(cipher.characterIndex(originalLetter[i],rotation)));
                continue;
            }
            result.append(cipher.characterIndex(originalLetter[i],rotation));
        }
        input.close();
        System.out.print(result);
    }
}