package syafa.java.hackerrank.KlinikKoding;
import java.util.*;

public class Angka17Aneh
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int batasKelipatan = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = 17; i <= batasKelipatan; i += 17)
        {
            System.out.println(i);
        }
    }
}