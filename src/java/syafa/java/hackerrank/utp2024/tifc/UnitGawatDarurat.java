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
        for (int i = 0; i < 2; i++)
        {
            sortedPatientName[i] = patientName[i];
            sortedPatientAge[i] = patientAge[i];
            sortedPatientOxygen[i] = patientOxygen[i];
            if (sortedPatientAge[i] < patientAge[i + 1])
            {
                sortedPatientAge[i] = patientAge[i + 1];
                sortedPatientName[i] = patientName[i + 1];
                sortedPatientOxygen[i] = patientOxygen[1];
            }
            if (i == 0)
            {
                if (sortedPatientAge[i] < patientAge[i + 2])
                {
                    sortedPatientAge[i] = patientAge[i + 2];
                    sortedPatientName[i] = patientName[i + 2];
                    sortedPatientOxygen[i] = patientOxygen[i + 2];
                }
    
            }
            if (sortedPatientOxygen[i] > sortedPatientOxygen[i + 1])
            {
                if (sortedPatientAge[i] == patientAge[i + 1])
                {
                    //
                }
                else
                {
                    sortedPatientName[i] = patientName[i + 1];
                    sortedPatientAge[i] = patientAge[i + 1];
                    sortedPatientOxygen[i] = patientOxygen[i + 1];
                }
            }
            if (i == 0)
            {
                if (sortedPatientOxygen[i] > sortedPatientAge[i + 2])
                {
                    if (sortedPatientAge[i] == patientAge[i + 2])
                    {
                        //
                    }
                    else
                    {
                        sortedPatientName[i] = patientName[i + 2];
                        sortedPatientAge[i] = patientAge[i + 2];
                        sortedPatientOxygen[i] = patientOxygen[i + 2];
                    }
                }
            }
        }
        for (int i = 0; i < patientName.length; i++)
        {
            System.out.println(sortedPatientName[i]);
            System.out.println(sortedPatientAge[i]);
            System.out.println(sortedPatientOxygen[i]);
        }
    }
}