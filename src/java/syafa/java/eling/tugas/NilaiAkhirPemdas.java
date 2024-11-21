package syafa.java.eling.tugas;
import java.util.Scanner;

class Student
{
    private String[][] studentDataGrade;
    private int totalGrade;
    private int studentAboveAverageAmount;
    private double average;
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
        this.average = (double) (((double) this.totalGrade / (double) studentDataGrade.length) / 2d);
        return average;
    }
    String[] getStudentAboveAverage()
    {
        getAverage();
        sortStudentGrade();
        for (int i = 0; i < studentDataGrade.length; i++)
        {
            if (Integer.parseInt(this.studentDataGrade[i][1]) > this.average)
            {
                this.studentAboveAverageAmount++;
            }
        }
        String[] studentAboveAverage = new String[this.studentAboveAverageAmount + 1];
        studentAboveAverage[0] = String.valueOf(this.studentAboveAverageAmount);
        int index = 1;
        for (int i = studentDataGrade.length - this.studentAboveAverageAmount; i < studentDataGrade.length; i++)
        {
            studentAboveAverage[index] = this.studentDataGrade[i][0];
            index++;
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
        int studentAmount = input.nextInt();
        input.nextLine();
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
        for (int i = 1 ; i < Integer.parseInt(studentAboveAverageAmount[0]) + 1; i++)
        {
            System.out.print(" " + studentAboveAverageAmount[i]);
        }
    }
}