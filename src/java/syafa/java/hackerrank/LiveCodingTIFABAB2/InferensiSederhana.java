package syafa.java.hackerrank.LiveCodingTIFABAB2;
import java.util.*;

public class InferensiSederhana
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int masuk = Integer.parseInt(input.nextLine());
        String operasi = input.nextLine();
        int elemen0 = input.nextInt();
        int elemen1 = input.nextInt();
        int elemen2 = input.nextInt();
        int elemen3 = input.nextInt();
        int elemen4 = input.nextInt();
        int elemen5 = input.nextInt();
        int elemen6 = input.nextInt();
        input.close();
        String out = "";
        if (operasi.equalsIgnoreCase("lt"))
        {
            for (int i = 0; i < 7;)
            {
                if (i == 0)
                {
                    if (masuk < elemen0)
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                    else 
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                }
                else if (i == 1)
                {
                    if (masuk < elemen1)
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                    else 
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                }
                else if (i == 2)
                {
                    if (masuk < elemen2)
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                    else 
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                }
                else if (i == 3)
                {
                    if (masuk < elemen3)
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                    else 
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                }
                else if (i == 4)
                {
                    if (masuk < elemen4)
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                    else 
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                }
                else if (i == 5)
                {
                    if (masuk < elemen5)
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                    else 
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                }
                else if (i == 6)
                {
                    if (masuk < elemen6)
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                    else 
                    {
                        i++;
                        i = 2 * i - 1;
                    }
                }
                else 
                {
                    out = "false";
                }
            }
        }
        System.out.print(out);
    }
}