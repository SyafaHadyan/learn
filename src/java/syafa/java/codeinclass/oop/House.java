package syafa.java.codeinclass.oop;

class HouseOOP
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
}

public class House
{
    public static void main(String[] args)
    {
        HouseOOP house0 = new HouseOOP();
        house0.outdoorColor = "White Outdoor";
        house0.indoorColor = "White";
        house0.length = 100d;
        house0.width = 200d;
        house0.height = 10d;
        System.out.println(house0.outdoorColor);
        System.out.println(house0.indoorColor);
        System.out.println(house0.length);
        System.out.println(house0.width);
        System.out.println(house0.height);
        HouseOOP.openDoor();
        HouseOOP.closeDoor();
        HouseOOP.openWindow();
        HouseOOP.closeWindow();
        //openDoor();
        //closeDoor();
        //openWindow();
        //closeWindow();
    }
}