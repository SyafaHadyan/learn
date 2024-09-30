package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganHaloBanyakDunia
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int perulangan = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = 1; i <= perulangan; i++)
        {
            System.out.print("Hello World!");
            if (i != perulangan)
            {
                System.out.print("\n");
            }
        }
    }
}