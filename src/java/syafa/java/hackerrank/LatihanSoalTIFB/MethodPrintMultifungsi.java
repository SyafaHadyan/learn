package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class MethodPrintMultifungsi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahInput = Integer.parseInt(input.nextLine());
        String outputArray[] = new String[jumlahInput];
        String output = "";
        for (int i = 0; i < jumlahInput; i++)
        {
            String kalimatArray[] = input.nextLine().split(" ");
            String simbolArray[] = input.nextLine().split(" ");
            try
            {
                output = simbolArray[0] + kalimatArray[0] + simbolArray[1] + kalimatArray[1] +simbolArray[1] + kalimatArray[2] + simbolArray[1] + kalimatArray[3] + simbolArray[1] + kalimatArray[4] + simbolArray[2];
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                try
                {
                    output = simbolArray[0] + kalimatArray[0] + simbolArray[1] + kalimatArray[1] +simbolArray[1] + kalimatArray[2] + simbolArray[1] + kalimatArray[3] + simbolArray[2];
                }
                catch (ArrayIndexOutOfBoundsException f)
                {
                    try
                    {
                        output = simbolArray[0] + kalimatArray[0] + simbolArray[1] + kalimatArray[1] +simbolArray[1] + kalimatArray[2] + simbolArray[2];
                    }
                    catch (ArrayIndexOutOfBoundsException fg)
                    {
                        output = simbolArray[0] + kalimatArray[0] + simbolArray[1] + kalimatArray[1] + simbolArray[2];
                    }
            }
            }
            outputArray[i] = output;
        }
        input.close();
        for (int i = 0; i < outputArray.length; i++)
        {
            System.out.print(outputArray[i]);
            if (i != outputArray.length - 1)
            {
                System.out.print("\n");
            }
        }
    }
}