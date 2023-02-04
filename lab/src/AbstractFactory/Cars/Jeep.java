package AbstractFactory.Cars;

public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("you are driving jeep");
    }

    public Jeep(){
        System.out.println("The jeep is assembled and ready for operation.");
    }
}
