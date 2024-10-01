package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganPakBom
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int barisSatu = Integer.parseInt(input.nextLine());
        int barisDuaSatu = input.nextInt();
        int barisDuaDua = input.nextInt();
        input.close();
        for (int i = 1; i <= barisSatu; i++)
        {
            if (i % barisDuaSatu != 0 && i % barisDuaDua != 0)
            {
                System.out.print(i);
            }
            else if (i % barisDuaSatu == 0 && i % barisDuaDua != 0)
            {
                System.out.print("Pak");
            }
            else if (i % barisDuaDua == 0 && i % barisDuaSatu != 0)
            {
                System.out.print("Bom");
            }
            else if (i % barisDuaSatu == 0 && i % barisDuaDua == 0)
            {
                System.out.print("PakBom");
            }
            if (i != barisSatu)
            {
                System.out.print("\n");
            }
        }
        System.out.print("\n");
        System.out.println(barisSatu);
        System.out.println(barisDuaSatu);
        System.out.print(barisDuaDua);
    }
}