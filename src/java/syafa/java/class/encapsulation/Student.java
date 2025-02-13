public class Student
{
    private String name = "";
    private int age = 0;

    String getName()
    {
        return this.name;
    }
    int getAge()
    {
        return this.age;
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setAge(int age)
    {
        if (age > 0)
        {
            this.age = age;
        }
        else
        {
            this.age = 0;
        }
    }
}
