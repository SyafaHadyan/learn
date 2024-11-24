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
            int tempInput = input.nextInt();
            boolean duplicate = false;
            for (int j = 0; j < data.length; j++)
            {
                if (data[j] == tempInput)
                {
                    duplicate = true;
                    break;
                }
            }
            if (!(duplicate))
            {
                data[dataUniqueAmount] = tempInput;
            }
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
                dataUniqueIndexList = dataUniqueIndexList.concat(" " + String.valueOf(data[i]));
            }
        }
        System.out.println("jumlah angka unik" + " : " + dataUniqueAmount);
        System.out.println("daftar angka unik" + " :" + dataUniqueIndexList);
    }
}