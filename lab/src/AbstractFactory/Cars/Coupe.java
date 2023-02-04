package AbstractFactory.Cars;

public class Coupe implements Car {
    @Override
    public void drive() {
        System.out.println("you are driving coupe car");
    }

    public Coupe(){
        System.out.println("The coupe is assembled and ready for operation.");
    }
}
