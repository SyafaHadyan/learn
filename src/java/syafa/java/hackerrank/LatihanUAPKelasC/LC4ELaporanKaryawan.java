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
    static final String[] VALID_ATTENDANCE_LIST =
    {
        "Hadir",
        "Absen",
        "Sakit",
        "Cuti",
        "Dinas",
        "Terlambat"
    };
    public static void reportBuilder(String[][] employeeDataList,int[][] employeeAttendanceDataList)
    {
        for (int i = 0; i < employeeDataList.length; i++)
        {
            System.out.println(employeeDataList[i][0] + " " + "(" + employeeDataList[i][1] + ")");
            for (int j = 0; j < (VALID_ATTENDANCE_LIST.length - ((employeeDataList[i][1].equalsIgnoreCase("Penjualan")) ? 0 : 1)); j++)
            {
                System.out.println(VALID_ATTENDANCE_LIST[j] + ":" + " " + employeeAttendanceDataList[i][j] + " " + "hari");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int employeeAmount = Integer.parseInt(input.nextLine());
        String[][] employeeDataList = new String[employeeAmount][DAY_LOG + 2];
        int[][] employeeAttendanceDataList = new int[employeeAmount][ATTENDANCE_INDEX.size()];
        for (int i = 0; i < employeeDataList.length; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                employeeDataList[i][j] = input.nextLine();
            }
            for (int j = 2; j < employeeDataList[i].length; j++)
            {
                String tempInput = input.next();
                employeeDataList[i][j] = tempInput;
                employeeAttendanceDataList[i][ATTENDANCE_INDEX.get(tempInput)]++;
            }
            input.nextLine();
            System.err.println(Arrays.toString(employeeDataList[i]));
            System.err.println("ATDM " + Arrays.toString(employeeAttendanceDataList[i]));
        }
        input.close();
        reportBuilder(employeeDataList,employeeAttendanceDataList);
    }
}