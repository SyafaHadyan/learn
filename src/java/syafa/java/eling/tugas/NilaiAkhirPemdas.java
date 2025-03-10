package syafa.java.eling.tugas;
import java.util.Scanner;

class Student
{
    String[][] studentDataGrade;
    private int totalGrade;
    private int studentAboveAverageAmount;
    private double average;
    public Student()
    {
        String[][] defaultEmptyDebug = 
        {
            {"Dengklek Sengklek Moklif","100"},
            {"Moklif Sengklek Dengklek","90"}
        };
        this.studentDataGrade = defaultEmptyDebug;
    }
    Student(String[][] inputData)
    {
        setStudentData(inputData);
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
            if (Integer.parseInt(this.studentDataGrade[i][1]) > (this.average * 2d))
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
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int studentAmount = input.nextInt();
        input.nextLine();
        String[][] studentData = new String[studentAmount][2];
        for (int i = 0; i < studentAmount; i++)
        {
            studentData[i] = input.nextLine().split("\s");
        }
        input.close();
        Student studentDataTransfer = new Student(studentData);
        String[] studentAboveAverageAmount = studentDataTransfer.getStudentAboveAverage();
        System.out.printf("%s%-2c%.2f\n","Rata-rata",':',studentDataTransfer.getAverage());
        System.out.print("Praktikan dengan nilai di atas rata-rata:");
        for (int i = 1 ; i < Integer.parseInt(studentAboveAverageAmount[0]) + 1; i++)
        {
            System.out.print(" " + studentAboveAverageAmount[i]);
        }
    }
}