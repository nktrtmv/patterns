package AbstractFactory.Factories;
import AbstractFactory.Cars.Coupe;

public class CoupeFactory implements CarFactory {
    @Override
    public Coupe build() {
        return new Coupe();
    }
}
