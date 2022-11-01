public abstract class Car {
    private Motor motor;
    private AutomotiveBattery automotiveBattery;

    public Car (Motor motor){
        this.motor = motor;
        this.automotiveBattery = new AutomotiveBattery();
    }

}
