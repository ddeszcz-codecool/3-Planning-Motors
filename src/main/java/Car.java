public abstract class Car {
    private Motor motor;
    private Battery battery;
    private Battery battery2;

    public Car (Motor motor, Battery battery, Battery battery2){
        this.motor = motor;
        this.battery = battery;
        this.battery = battery2;
    }

    public Car(Motor motor, Battery battery) {
        this.motor = motor;
        this.battery = battery;
    }
}
