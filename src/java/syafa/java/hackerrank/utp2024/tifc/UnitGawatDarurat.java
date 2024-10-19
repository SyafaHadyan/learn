package syafa.java.hackerrank.utp2024.tifc;
import java.util.*;
//import java.util.stream.*;

public class UnitGawatDarurat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] patientName = new String[3];
        int[] patientAge = new int[3];
        int[] patientOxygen = new int[3];
        for (int i = 0; i < 3; i++)
        {
            patientName[i] = input.next();
            patientAge[i] = Integer.parseInt(input.next());
            patientOxygen[i] = Integer.parseInt(input.next());
        }
        input.close();
    }
}