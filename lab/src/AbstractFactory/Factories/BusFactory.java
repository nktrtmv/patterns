package AbstractFactory.Factories;
import AbstractFactory.Cars.Bus;

public class BusFactory implements CarFactory {
    @Override
    public Bus build() {
        return new Bus();
    }
}
