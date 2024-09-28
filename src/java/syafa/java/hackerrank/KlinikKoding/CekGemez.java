package syafa.java.hackerrank.KlinikKoding;
import java.util.*;

public class CekGemez
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cek = Integer.parseInt(input.nextLine());
        if (cek % 13 == 0 && cek % 17 == 0)
        {
            System.out.print("GEMEZ CUY");
        }
        else
        {
            System.out.print("gak gemez...");
        }
    }
}