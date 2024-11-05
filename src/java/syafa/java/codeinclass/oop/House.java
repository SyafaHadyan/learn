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
    public static double getArea(double length,double width)
    {
        return length * width;
    }
    public static double getVolume(double length,double width,double height)
    {
        return length * width * height;
    }
}

public class House
{
    private int test = 5;

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
        System.out.println(HouseOOP.getArea(house0.length,house0.width));
        System.out.println(HouseOOP.getVolume(house0.length,house0.width,house0.height));
        //openDoor();
        //closeDoor();
        //openWindow();
        //closeWindow();
    }
    public void test()
    {
        //this.test = test;
        System.out.println(test);
    }
}