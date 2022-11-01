public class ElectricCar extends Car implements Rechargeable{
    public ElectricCar(ElectricMotor motor1, Battery battery) {
        super(motor1, battery);
    }

    @Override
    public void charge() {

    }
}
