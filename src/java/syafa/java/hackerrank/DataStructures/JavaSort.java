package syafa.java.hackerrank.DataStructures;
import java.util.*;

public class JavaSort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amountOfStudents = Integer.parseInt(input.nextLine());
        int studentID = 0;
        String studentName = "";
        double CGPA = 0d;
        int studentIDArray[] = new int[amountOfStudents];
        String studentNamearray[] = new String[amountOfStudents];
        double CGPAArray[] = new double[amountOfStudents];
        for (int i = 0; i < amountOfStudents; i++)
        {
            studentIDArray[i] = input.nextInt();
            studentNamearray[i] = input.next();
            CGPAArray[i] = input.nextDouble();
        }
    }
}