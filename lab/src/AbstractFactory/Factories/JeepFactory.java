package AbstractFactory.Factories;
import AbstractFactory.Cars.Jeep;

public class JeepFactory implements CarFactory {
    @Override
    public Jeep build() {
        return new Jeep();
    }
}