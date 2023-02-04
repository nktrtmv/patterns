package AbstractFactory.Cars;

public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println("You are driving bus.");
    }

    public Bus(){
        System.out.println("The bus is assembled and ready for operation.");
    }
}
