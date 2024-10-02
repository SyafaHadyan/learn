package syafa.java.hackerrank.LiveCodingTIFABAB2;
import java.util.*;

public class InferensiSederhana
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int masuk = Integer.parseInt(input.nextLine());
        String operasi = input.nextLine();
        char op = ' ';
        int elemen0 = input.nextInt();
        int elemen1 = input.nextInt();
        int elemen2 = input.nextInt();
        int elemen3 = input.nextInt();
        int elemen4 = input.nextInt();
        int elemen5 = input.nextInt();
        int elemen6 = input.nextInt();
        input.close();
        if (operasi.equalsIgnoreCase("lt"))
        {
            for (int i = 1; i <= 7;)
            {
                if (i == 0)
                {
                    if (masuk < elemen0)
                    {
                        i++;
                        i = 2 * i -1;
                    }
                    else if (masuk < elemen1)
                    {
                        i++;
                        i = 2 * i -1;
                    }
                    else if (masuk < elemen2)
                    {
                        i++;
                        i = 2 * i -1;
                    }
                    else if (masuk < elemen3)
                    {
                        i++;
                        i = 2 * i -1;
                    }
                    else if (masuk < elemen4)
                    {
                        i++;
                        i = 2 * i -1;
                    }
                    else if (masuk < elemen5)
                    {
                        i++;
                        i = 2 * i -1;
                    }
                    else if (masuk < elemen6)
                    {
                        i++;
                        i = 2 * i -1;
                    }
                }
            }
        }
    }
}