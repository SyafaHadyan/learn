package syafa.java.hackerrank.LiveCoding4TIFC;
// dilarang melakukan import package selain yang sudah disediakan
import java.util.Scanner;

public class NilaiAkhirPemdas
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int studentAmount = input.nextInt();
        input.nextLine();
        String[] studentName = new String[studentAmount];
        double[] studentGrade = new double[studentAmount];
        String[] above = new String[studentAmount];
        double average = 0d;
        int counterStudent = 0;
        for (int i = 0; i < studentAmount; i++)
        {
            studentName[i] = input.next();
            studentGrade[i] = input.nextInt();
            average += studentGrade[i];
        }
        input.close();
        for (int i = 0; i < studentAmount - 1; i++)
        {
            for (int j = 0; j < studentAmount - 2 - i; j++)
            {
                if (studentGrade[j] > studentGrade[j + 1])
                {
                    double tempGrade = studentGrade[j];
                    String tempStudent = studentName[j];
                    studentGrade[j] = studentGrade[j + 1];
                    studentName[j] = studentName[j + 1];
                    studentGrade[j + 1] = tempGrade;
                    studentName[j + 1] = tempStudent;
                }
            }
        }
        average /= studentAmount;
        int counter = 0;
        for (int i = 0; i < studentAmount; i++)
        {
            if (studentGrade[i] > average)
            {
                above[counter] = studentName[i];
                counter++;
                counterStudent++;
            }
        }
        System.out.printf("%s%.2f\n","Rata-rata: ",average);
        System.out.print("Praktikan dengan nilai di atas rata-rata: ");
        for (int i = 0; i < counterStudent; i ++)
        {
            System.out.print(above[i]);
            if (counterStudent - i != 1)
            {
                System.out.print(" ");
            }
        }
    }
}