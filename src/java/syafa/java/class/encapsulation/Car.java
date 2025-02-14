public class Car extends Vehicle
{
    private String brand = "";
    void setBrand(String brand)
    {
        this.brand = brand;
    }
    void setColor(String color)
    {
        this.color = color;
    }
    void setSpeed(long speed)
    {
        this.speed = speed;
    }
    String getBrand()
    {
        return this.brand;
    }
    String getColor()
    {
        return this.color;
    }
    long getSpeed()
    {
        return this.speed;
    }
    void increaseSpeed(long speed)
    {
        this.speed += speed;
    }
    void decreaseSpeed(long speed)
    {
        if (speed > this.speed)
        {
            stop(); 
        }
        else
        {
            this.speed -= speed;
        }
    }
    void stop()
    {
        this.speed = 0;
    }
}
