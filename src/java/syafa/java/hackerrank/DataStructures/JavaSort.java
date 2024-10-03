package syafa.java.hackerrank.DataStructures;
import java.util.*;

public class JavaSort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amountOfStudents = Integer.parseInt(input.nextLine());
        int studentIDArray[] = new int[amountOfStudents];
        String studentNamearray[] = new String[amountOfStudents];
        double CGPAArray[] = new double[amountOfStudents];
        String dataInputArray[] = new String[amountOfStudents * 3];
        int studentID = 0;
        String studentName = "";
        double CGPA = 0d;
        for (int i = 0; i < amountOfStudents; i++)
        {
            /*
            studentIDArray[i] = input.nextInt();
            studentNamearray[i] = input.next();
            CGPAArray[i] = input.nextDouble();
            */
            dataInputArray = input.nextLine().split(" ");
        }
        //Arrays.sort(dataInputArray);
        for (int i = 0; i < dataInputArray.length; i++)
        {
            System.out.print(dataInputArray[i]);
            if (i % 2 != 0 || i == 0)
            {
                System.out.print(" ");
            }
            else if (i != 0)
            {
                System.out.print("\n");
            }
        }
    }
}