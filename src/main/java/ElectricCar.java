public class ElectricCar extends Car implements Rechargeable{
    private ElectricMotor electricMotor;
    private AutomotiveBattery automotiveBattery;
    private ElectricVehicleBattery electricVehicleBattery;
    public ElectricCar(ElectricMotor electricMotor, ElectricVehicleBattery electricVehicleBattery, AutomotiveBattery automotiveBattery) {
        super(electricMotor, electricVehicleBattery, automotiveBattery);
    }

    @Override
    public void charge() {

    }
}
