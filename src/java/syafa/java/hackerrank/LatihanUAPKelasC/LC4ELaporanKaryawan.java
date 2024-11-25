package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4ELaporanKaryawan
{
    static final int DAY_LOG = 30;
    static final Map<String,Integer> ATTENDANCE_INDEX = Map.ofEntries
    (
        Map.entry("H",0),
        Map.entry("A",1),
        Map.entry("S",2),
        Map.entry("C",3),
        Map.entry("D",4),
        Map.entry("T",5)
    );
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int employeeAmount = Integer.parseInt(input.nextLine());
        String[][] employeeDataList = new String[employeeAmount][DAY_LOG + 2];
        int[] employeeAttendanceDataList = new int[employeeAmount];
        for (int i = 0; i < employeeDataList.length; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                employeeDataList[i][j] = input.nextLine();
            }
            for (int j = 2; j < employeeDataList[i].length; j++)
            {
                employeeDataList[i][j] = input.next();
            }
            input.nextLine();
            System.err.println(Arrays.toString(employeeDataList[i]));
        }
        input.close();
    }
}