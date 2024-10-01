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
        input.nextLine();
        input.close();
        for (int i = 1; i <= barisSatu; i++)
        {
            if (!(barisSatu % barisDuaSatu == 0) && !(barisSatu % barisDuaDua == 0))
            {
                System.out.print(i);
            }
            else if (barisSatu % barisDuaSatu == 0)
            {
                System.out.print("Pak");
            }
            else if (barisSatu % barisDuaDua == 0)
            {
                System.out.print("Bom");
            }
            else if ((barisSatu % barisDuaSatu == 0) && (barisSatu % barisDuaDua == 0))
            {
                System.out.print("PakBom");
            }
            if (i != barisSatu)
            {
                System.out.print("\n");
            }
        }
    }
}