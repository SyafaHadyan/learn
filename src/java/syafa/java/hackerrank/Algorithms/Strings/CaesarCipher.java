package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class CaesarCipher
{
    static class chiper
    {
        public static boolean isUpperCase(char character)
        {
            return isUpperCase(character);
        }
        public static char characterIndex(char character,boolean isUpperCase)
        {
            char[] characterIndex = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            if (isUpperCase)
            {
                return Character.toUpperCase(character);
            }
            return character;
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
        input.close();
    }
}