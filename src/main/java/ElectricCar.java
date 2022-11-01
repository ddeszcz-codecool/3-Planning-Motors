public class ElectricCar extends Car implements Rechargeable{
    private ElectricMotor electricMotor;
    private ElectricVehicleBattery electricVehicleBattery;
    public ElectricCar(ElectricMotor electricMotor, ElectricVehicleBattery electricVehicleBattery) {
        super(electricMotor);
        this.electricVehicleBattery = electricVehicleBattery;
    }

    @Override
    public void charge() {

    }
}
