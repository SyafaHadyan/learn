public class BrandCar
{
    public static void main(String[] args)
    {
        Car brandCar = new Car();
        brandCar.setBrand("Car Brand Name");
        brandCar.setColor("White");
        brandCar.setSpeed(100l);
        brandCar.getBrand();
        brandCar.getColor();
        brandCar.getSpeed();
        brandCar.increaseSpeed(20l);
        brandCar.decreaseSpeed(10l);
        System.out.println(brandCar.getSpeed());
        brandCar.stop();
        System.out.println(brandCar.getBrand());
        System.out.println(brandCar.getColor());
        System.out.println(brandCar.getSpeed());
    }
}
