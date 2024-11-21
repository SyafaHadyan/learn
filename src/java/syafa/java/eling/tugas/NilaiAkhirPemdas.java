package syafa.java.eling.tugas;
import java.util.Scanner;

class Student
{
    private String[][] studentDataGrade;
    private int totalGrade;
    private int studentAboveAverageAmount;
    Student()
    {
        //
    }
    void setStudentData(String[][] inputData)
    {
        this.studentDataGrade = inputData;
    }
    double getAverage()
    {
        for (int i = 0; i < studentDataGrade.length; i++)
        {
            this.totalGrade += Integer.parseInt(studentDataGrade[i][1]);
        }
        return (double) this.totalGrade / studentDataGrade.length;
    }
    String[] getStudentAboveAverage()
    {
        sortStudentGrade();
        double average = getAverage();
        for (int i = 0; i < studentDataGrade.length; i++)
        {
            if (Integer.parseInt(this.studentDataGrade[i][1]) > average)
            {
                this.studentAboveAverageAmount++;
            }
        }
        String[] studentAboveAverage = new String[this.studentAboveAverageAmount + 1];
        studentAboveAverage[0] = String.valueOf(this.studentAboveAverageAmount);
        for (int i = studentDataGrade.length - this.studentAboveAverageAmount + 1; i < studentAboveAverage.length; i++)
        {
            studentAboveAverage[i] = this.studentDataGrade[i][0];
        }
        return studentAboveAverage;
    }
    void sortStudentGrade()
    {
        for (int i = 0; i < studentDataGrade.length; i++)
        {
            for (int j = 0 + i; j < studentDataGrade.length; j++)
            {
                if (Integer.parseInt(this.studentDataGrade[i][1]) > Integer.parseInt(this.studentDataGrade[j][1]))
                {
                    String[] tempSwap = this.studentDataGrade[j];
                    this.studentDataGrade[j] = this.studentDataGrade[i];
                    this.studentDataGrade[i] = tempSwap;
                }
            }
        }
    }
}
public class NilaiAkhirPemdas
{
    /*
     * 4
     * nafi 90
     * yoga 80
     * toni 75
     * azel 60
     * 
     * Rata-rata: 76.25
     * Praktikan dengan nilai di atas rata-rata: yoga nafi
     */
    public static void main(String[] args)
    {
        Student studentDataTransfer = new Student();
        Scanner input = new Scanner(System.in);
        int studentAmount = Integer.parseInt(input.nextLine());
        String[][] studentData = new String[studentAmount][2];
        for (int i = 0; i < studentAmount; i++)
        {
            studentData[i] = input.nextLine().split("\s");
        }
        input.close();
        studentDataTransfer.setStudentData(studentData);
        String[] studentAboveAverageAmount = studentDataTransfer.getStudentAboveAverage();
        System.out.printf("%s%-2c%.2f\n","Rata-rata",':',studentDataTransfer.getAverage());
        System.out.print("Praktikan dengan nilai di atas rata-rata:");
        for (int i = 0; i < studentAboveAverageAmount.length; i++)
        {
            System.out.print(" " + studentAboveAverageAmount[i]);
        }
    }
}