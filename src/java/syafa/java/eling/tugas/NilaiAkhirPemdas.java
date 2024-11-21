package syafa.java.eling.tugas;
import java.util.Scanner;

class Student
{
    private String[][] studentDataGrade;
    private int totalGrade;
    Student()
    {
        this.studentDataGrade[0] = "Nama 100".split("\s");
    }
    void setStudentData(String[][] inputData)
    {
        this.studentDataGrade = inputData;
    }
    double getAverage()
    {
        return this.totalGrade / studentDataGrade.length;
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
        String[][] studentData = new String[2][studentAmount];
        for (int i = 0; i < studentAmount; i++)
        {
            studentData[i] = input.nextLine().split("\s");
        }
        input.close();
        studentDataTransfer.setStudentData(studentData);
        System.out.printf("%s%-2c%.2f\n","Rata-rata",':',studentDataTransfer.getAverage());
    }
}