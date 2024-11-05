package syafa.java.codeinclass.oop;

public class House
{
    public String outdoorColor;
    public String indoorColor;
    public double length;
    public double width;
    public double height;

    public static void openDoor()
    {
        System.out.println("Open Door");
    }
    public static void closeDoor()
    {
        System.out.println("Close Door");
    }
    public static void openWindow()
    {
        System.out.println("Open Window");
    }
    public static void closeWindow()
    {
        System.out.println("Close Window");
    }
    public static void main(String[] args)
    {
        openDoor();
        closeDoor();
        openWindow();
        closeWindow();
    }
}