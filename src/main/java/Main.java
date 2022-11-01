public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car(new ElectricMotor(), new Battery());
        ElectricCar electricCar = new ElectricCar(new ElectricMotor());
        ElectricCar electricCar1 = new ElectricCar(new ElectricMotor());
    }
}
