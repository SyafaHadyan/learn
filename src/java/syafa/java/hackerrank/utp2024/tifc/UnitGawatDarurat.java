package syafa.java.hackerrank.utp2024.tifc;
import java.util.*;
//import java.util.stream.*;

public class UnitGawatDarurat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] patientName = new String[3];
        String[] sortedPatientName = new String[3];
        int[] patientAge = new int[3];
        int[] sortedPatientAge = new int[3];
        int[] patientOxygen = new int[3];
        int[] sortedPatientOxygen = new int[3];
        for (int i = 0; i < 3; i++)
        {
            patientName[i] = input.next();
            patientAge[i] = Integer.parseInt(input.next());
            patientOxygen[i] = Integer.parseInt(input.next());
        }
        input.close();
        Arrays.sort(patientOxygen);
        sortedPatientName[0] = patientName[0];
        sortedPatientAge[0] = patientAge[0];
        sortedPatientOxygen[0] = patientOxygen[0];
        if (sortedPatientAge[0] < patientAge[1])
        {
            sortedPatientAge[0] = patientAge[1];
            sortedPatientName[0] = patientName[1];
            sortedPatientOxygen[0] = patientOxygen[1];
        }
        if (sortedPatientAge[0] < patientAge[2])
        {
            sortedPatientAge[0] = patientAge[2];
            sortedPatientName[0] = patientName[2];
            sortedPatientOxygen[0] = patientOxygen[2];
        }
        if (sortedPatientOxygen[0] > sortedPatientOxygen[1])
        {
            //
        }
        if (sortedPatientOxygen[0] > sortedPatientAge[2])
        {
            //
        }
    }
}