import java.util.Scanner;

public class Name
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        student.setName(input.nextLine());
        student.setAge(Integer.parseInt(input.nextLine()));
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
