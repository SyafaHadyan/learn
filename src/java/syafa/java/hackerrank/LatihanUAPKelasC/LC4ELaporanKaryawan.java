package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4ELaporanKaryawan
{
    static final int DAY_LOG = 30;
    static final int SALES_SPECIAL_CONSTRAINT = 5;
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
    static final Map<String,Integer> ATTENDANCE_PERFORMANCE_INDEX = Map.ofEntries
    (
        Map.entry("Teknik",0),
        Map.entry("Penjualan",1),
        Map.entry("Keuangan",2)
    );
    static final int[][] ATTENDANCE_PERFORMANCE_CATEGORIES =
    {
        {89,80},
        {84,75},
        {79,70}
    };
    static final int[][] ATTENDANCE_CONSTRAINTS =
    {
        {90,1,2},
        {85,2},
        {80,1,3}
    };
    public static String performanceStatus(String division,double attendancePerformance,int[] attendanceDataSpecialRequest)
    {
        /*
         * [2] Terlambat
         */
        if (division.equalsIgnoreCase("Penjualan"))
        {
            if (attendanceDataSpecialRequest[0] > SALES_SPECIAL_CONSTRAINT || attendanceDataSpecialRequest[1] > ATTENDANCE_CONSTRAINTS[1][1])
            {
                return "Perlu Pengawasan";
            }
            if (attendanceDataSpecialRequest[2] > ATTENDANCE_CONSTRAINTS[1][1])
            {
                return "Terlambat Berlebihan";
            }
        }
        if (attendancePerformance > ATTENDANCE_PERFORMANCE_CATEGORIES[ATTENDANCE_PERFORMANCE_INDEX.get(division)][0])
        {
            if (division.equalsIgnoreCase("Penjualan"))
            {
                if (attendanceDataSpecialRequest[2] > ATTENDANCE_CONSTRAINTS[1][1])
                {
                    attendancePerformance = ATTENDANCE_PERFORMANCE_CATEGORIES[ATTENDANCE_PERFORMANCE_INDEX.get(division)][1] + 1;
                }
            }
            return "Sangat Baik";
        }
        if (attendancePerformance > ATTENDANCE_PERFORMANCE_CATEGORIES[ATTENDANCE_PERFORMANCE_INDEX.get(division)][1])
        {
            if (division.equalsIgnoreCase("Penjualan"))
            {
                //
            }
            return "Baik";
        }
        return "Perlu Peningkatan";
    }
    public static void reportBuilder(String[][] employeeDataList,int[][] employeeAttendanceDataList)
    {
        /*
         * x / 100 * 30 = 15
         * 
         * 30x = 1500
         * x = 1500 / 30
         */
        double overallAttendancePercentage = 0d;
        for (int i = 0; i < employeeDataList.length; i++)
        {
            System.out.println(employeeDataList[i][0] + " " + "(" + employeeDataList[i][1] + ")");
            for (int j = 0; j < (VALID_ATTENDANCE_LIST.length - ((employeeDataList[i][1].equalsIgnoreCase("Penjualan")) ? 0 : 1)); j++)
            {
                System.out.println(VALID_ATTENDANCE_LIST[j] + ":" + " " + employeeAttendanceDataList[i][j] + " " + "hari");
            }
            double attendancePercentage = ((double) (((double) employeeAttendanceDataList[i][0] * 100d) / (double) DAY_LOG));
            overallAttendancePercentage += attendancePercentage;
            System.out.printf("%s%-2c%.2f%c\n\n","Presentase Kehadiran",':',attendancePercentage,'%');
        }
        overallAttendancePercentage /= employeeDataList.length;
        System.out.printf("%s%-2c%.2f%c\n\n","Rata-rata persentase kehadiran seluruh karyawan",':',overallAttendancePercentage,'%');
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