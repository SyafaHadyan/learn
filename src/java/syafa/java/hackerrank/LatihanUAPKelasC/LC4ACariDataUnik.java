package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4ACariDataUnik
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataAmount = Integer.parseInt(input.nextLine());
        int dataUniqueAmount = 0;
        String dataUniqueIndexList = "";
        int[] data = new int[dataAmount];
        for (int i = 0; i < data.length; i++)
        {
            data[i] = input.nextInt();
        }
        input.close();
        for (int i = 0; i < data.length; i++)
        {
            boolean unique = true;
            for (int j = 1 + i; j < data.length; j++)
            {
                if (data[i] == data[j])
                {
                    unique = false;
                    break;
                }
            }
            if (unique)
            {
                dataUniqueAmount++;
                dataUniqueIndexList = dataUniqueIndexList.concat(String.valueOf(data[i]));
            }
        }
    }
}