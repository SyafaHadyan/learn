package syafa.java.eling.remedialutp2024;
import java.util.Scanner;

public class UnitGawatDarurat
{
    static final int PATIENT_AMOUNT = 3;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] patientList = new String[PATIENT_AMOUNT][3];
        for (int i = 0; i < patientList.length; i++)
        {
            for (int j = 0; j < patientList[i].length; j++)
            {
                patientList[i][j] = input.next();
            }
            input.nextLine();
        }
        input.close();
        for (int i = 0; i < patientList.length; i++)
        {
            for (int j = 1 + i; j < patientList.length; j++)
            {
                if (Integer.parseInt(patientList[i][2]) > Integer.parseInt(patientList[j][2]))
                {
                    String[] tempSwap = patientList[j];
                    patientList[j] = patientList[i];
                    patientList[i] = tempSwap;
                }
                else if
                (
                    Integer.parseInt(patientList[i][2]) == Integer.parseInt(patientList[j][2]) &&
                    Integer.parseInt(patientList[i][1]) < Integer.parseInt(patientList[j][1])
                )
                {
                    String[] tempSwap = patientList[j];
                    patientList[j] = patientList[i];
                    patientList[i] = tempSwap;
                }
            }
        }
        for (int i = 0; i < patientList.length; i++)
        {
            System.out.print("Prioritas" + " " + (i + 1) + ": " + patientList[i][0] + ((patientList.length - i != 1) ? "\n" : ""));
        }
    }
}