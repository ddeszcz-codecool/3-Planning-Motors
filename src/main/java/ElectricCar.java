public class ElectricCar extends Car implements Rechargeable{
    private ElectricMotor electricMotor;
    public ElectricCar(ElectricMotor electricMotor, Battery battery) {
        super(electricMotor, battery);
    }

    @Override
    public void charge() {

    }
}
