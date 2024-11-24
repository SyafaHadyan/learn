package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4ACariDataUnik
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataAmount = Integer.parseInt(input.nextLine());
        int dataUniqueAmount = 0;
        int[] data = new int[dataAmount];
        int[] dataUnique = new int[dataAmount];
        for (int i = 0; i < data.length; i++)
        {
            data[i] = input.nextInt();
        }
        input.close();
        for (int i = 0; i < data.length; i++)
        {
            boolean duplicate = false;
            for (int j = 1 + i; j < data.length; j++)
            {
                if (data[i] == data[j])
                {
                    duplicate = true;
                    break;
                }
            }
            if (!(duplicate))
            {
                dataUnique[dataUniqueAmount] = data[i];
                dataUniqueAmount++;
            }
        }
        System.out.println("jumlah angka unik" + " : " + dataUniqueAmount);
        System.out.print("daftar angka unik" + " :");
        for (int i = 0; i < dataUniqueAmount; i++)
        {
            System.out.print(" " + data[i]);
        }
        System.err.println();
    }
}