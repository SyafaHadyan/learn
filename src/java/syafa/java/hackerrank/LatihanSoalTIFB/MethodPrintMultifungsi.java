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
            output = simbolArray[0] + kalimatArray[0] + simbolArray[1] + kalimatArray[1] +simbolArray[1] + kalimatArray[2] + simbolArray[2];
            outputArray[i] = output;
        }
        for (String keluar : outputArray)
        {
            System.out.print(keluar);
        }
    }
}