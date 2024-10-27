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
            if ((new String(characterIndex).indexOf(character) + rotation) > 25)
            {
                return characterIndex[(new String(characterIndex).indexOf(character) + rotation) - 25];
            }
            return characterIndex[(new String(characterIndex).indexOf(character) + rotation)];
        }
    }
    public static void main(String[] args)
    {
        /*
         * 11
         * middle-Outz
         * 2
         * 
         * okffng-Qwvb
         * 
         * Original alphabet:      abcdefghijklmnopqrstuvwxyz
         * Alphabet rotated +2:    cdefghijklmnopqrstuvwxyzab
         * m -> o
         * i -> k
         * d -> f
         * d -> f
         * l -> n
         * e -> g
         * -    -
         * O -> Q
         * u -> w
         * t -> v
         * z -> b
         */
        Scanner input = new Scanner(System.in);
        int wordLength = Integer.parseInt(input.nextLine());
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