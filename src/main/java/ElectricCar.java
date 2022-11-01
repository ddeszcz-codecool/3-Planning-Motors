public class ElectricCar extends Car{
//    Motor electricMotor;
    Motor electricMotor;

    public ElectricCar(Motor motor, Battery battery, Motor electricMotor) {
        super(motor, battery);
        this.electricMotor = electricMotor;
    }

    ElectricCar(Motor electricMotor){

    }

}
