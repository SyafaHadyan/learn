package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4ELaporanKaryawan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int employeeAmount = Integer.parseInt(input.nextLine());
        String[][] employeeList = new String[employeeAmount][2];
        for (int i = 0; i < employeeList.length; i++)
        {
            for (int j = 0; j < employeeList[i].length; j++)
            {
                employeeList[i][j] = input.nextLine();
            }
        }
        input.close();
    }
}