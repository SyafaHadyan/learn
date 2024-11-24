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
                dataUniqueAmount++;
            }
        }
        input.close();
        System.out.println("jumlah angka unik" + " : " + dataUniqueAmount);
        System.out.println("daftar angka unik" + " :");
        for (int i = 0; i < dataUniqueAmount; i++)
        {
            System.out.print(" " + data[i]);
        }
        System.err.println();
    }
}