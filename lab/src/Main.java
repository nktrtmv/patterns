import AbstractFactory.Cars.Bus;
import AbstractFactory.Cars.Car;
import AbstractFactory.Factories.BusFactory;
import AbstractFactory.Factories.CoupeFactory;
import AbstractFactory.Factories.JeepFactory;
import Observer.PoliceStation;
import Observer.TrafficPolicePost;

import java.util.ArrayList;
import java.util.Formatter;



/*
Вариант 2
 Шаблон “Наблюдатель”. Проект “Оповещение постов ГАИ”. В проекте должна быть реализована
 отправка сообщений всем постам ГАИ. Пример использования шаблона в главе 2.
Вариант 29
 Шаблон “Абстрактная фабрика”. Проект “Заводы по производству автомобилей”. В проекте должно
 быть реализована возможность создавать автомобили различных типов на разных заводах. Пример
 использования шаблона в главе 4.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("test Observer pattern implementation");
        testObserver();
        System.out.println("\n<===================================================================>\n<===================================================================>\n");
        testAbstractFactory();
    }

    private static void testObserver() {
        PoliceStation police = new PoliceStation();
        ArrayList<TrafficPolicePost> posts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Formatter name = new Formatter(), area = new Formatter();
            name.format("%d name", i);
            area.format("%d area", i);
            posts.add(new TrafficPolicePost(name.toString(), area.toString()));
            police.addObserver(posts.get(i));
        }

        System.out.println("\n<==========================>\n");

        System.out.println("Оповещение о нарушении ПДД от поста 0:\n ");
        police.notifyObservers(posts.get(0), posts.get(0).getPostArea());

        System.out.println("\n<==========================>\n");

        System.out.println("Посты ГАИ 7, 8, 9 расформированы, сотрудники распределены по оставшимся постам.");


        police.deleteObserver(posts.get(7));
        police.deleteObserver(posts.get(8));
        police.deleteObserver(posts.get(9));

        System.out.println("\n<==========================>\n");

        System.out.println("Оповещение о нарушении ПДД от поста 1:\n ");
        police.notifyObservers(posts.get(1), posts.get(1).getPostArea());

        System.out.println("\n<==========================>\n");
    }


    private static void testAbstractFactory() {
        ArrayList<Car> cars = new ArrayList<>();
        BusFactory busFactory = new BusFactory();
        CoupeFactory coupeFactory = new CoupeFactory();
        JeepFactory jeepFactory = new JeepFactory();
        for (int i = 0; i < 50; i++){
            int r = (int)(Math.random() * 3);
            if (r == 0){
                cars.add(busFactory.build());
            } else if (r == 1){
                cars.add(jeepFactory.build());
            } else {
                cars.add(coupeFactory.build());
            }
        }
    }
}