public class TwoDimension
{
    String name = "";
    long length = 0l;
    long width = 0l;
    TwoDimension()
    {
        //
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setSize(long length, long width)
    {
        this.length = length;
        this.width = width;
    }
    void info()
    {
        System.out.println("Name " + this.name);
        System.out.println("Area " + area());
    }
    long area()
    {
        return length * width;
    }
}
