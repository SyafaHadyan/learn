package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class CariKata
{
    public static void main(String[] args)
    {
        /*
         * aku adalah dia dan dia adalah aku
         * aku
         * 
         * aku ditemukan pada posisi ke-1.
         * aku ditemukan pada posisi ke-7.
         * 
         * lorem ipsum dolor sit amet
         * cinta
         * 
         * cinta tidak ditemukan.
         */
        Scanner input = new Scanner(System.in);
        String[] dictionary = input.nextLine().split(" ");
        String search = input.nextLine();
        input.close();
        ArrayList<String> foundAt = new ArrayList<>();
        for (int i = 0; i < dictionary.length; i++)
        {
            if (search.equalsIgnoreCase(dictionary[i]))
            {
                foundAt.add(search + "ditemukan pada posisi ke" + '-' + (i + 1));
            }
        }
    }
}