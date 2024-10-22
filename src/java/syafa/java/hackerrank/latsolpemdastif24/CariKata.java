package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class CariKata
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] dictionary = input.nextLine().split(" ");
        String search = input.nextLine();
        input.close();
        ArrayList<String> foundAt = new ArrayList<>();
        for (int i = 0; i < dictionary.length; i++)
        {
            if (search.equalsIgnoreCase(dictionary[i]))
            {
                foundAt.add(search + ' ' + "ditemukan pada posisi ke" + '-' + (i + 1) + '.');
            }
        }
        if (foundAt.size() == 0)
        {
            System.out.print(search + ' ' + "tidak ditemukan" + '.');
            return;
        }
        for (int i = 0; i < foundAt.size(); i++)
        {
            System.out.print(foundAt.get(i));
            if (foundAt.size() - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}