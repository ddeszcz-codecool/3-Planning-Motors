public abstract class Car {
    private Motor motor;
    private Battery battery;

    public Car (Motor motor, Battery battery){
        this.motor = motor;
        this.battery = battery;
    }

    public Car(Motor motor) {
        this.motor = motor;
    }
}
