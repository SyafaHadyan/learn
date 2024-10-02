package syafa.java.hackerrank.LiveCodingTIFABAB2;
import java.util.*;

public class DengklekvsSengklek
{
    public static void main(String[] args)
    {
        String hasil[] = new String[4];
        Scanner input = new Scanner(System.in);
        int skorDengklek = 0;
        int skorSengklek = 0;
        for (int i = 1; i <= 4; i++)
        {
            String dengklek = input.next();
            String sengklek = input.next();
            input.nextLine();
            if (dengklek.equalsIgnoreCase(sengklek))
            {
                hasil[i] = "Seri";
            }
            else if (dengklek.equalsIgnoreCase("Batu") && sengklek.equalsIgnoreCase("Gunting"))
            {
                hasil[i] = "Dengklek menang";
            }
            else if (de)
        }
    }
}