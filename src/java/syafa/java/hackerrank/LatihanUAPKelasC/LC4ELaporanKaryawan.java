package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4ELaporanKaryawan
{
    static final int DAY_LOG = 30;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int employeeAmount = Integer.parseInt(input.nextLine());
        String[][] employeeList = new String[employeeAmount][DAY_LOG + 2];
        for (int i = 0; i < employeeList.length; i++)
        {
            for (int j = 0; j < employeeList[i].length - DAY_LOG; j++)
            {
                employeeList[i][j] = input.nextLine();
            }
            for (int j = 2; j < DAY_LOG; j++)
            {
                employeeList[i][j] = input.next();
            }
            input.nextLine();
            System.err.println(Arrays.toString(employeeList[i]));
        }
        input.close();
    }
}