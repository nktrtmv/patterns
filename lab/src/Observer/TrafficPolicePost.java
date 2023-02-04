package Observer;

import java.nio.file.Path;

public class TrafficPolicePost implements Observer {
    private final String name;
    private final String area;

    public TrafficPolicePost(String name, String area) {
        this.name = name;
        this.area = area;
    }

    public String getPostArea(){
        return area;
    }

    @Override
    public void getReport(String trafficViolation, String area, String carNumber) {
        System.out.println("Пост ГАИ '" + name + "' получил информацию про нарушение ПДД " +
                "'" + trafficViolation + "' " +
                "в районе '" + area + "' " +
                "водителем автомобиля с номером: '" + carNumber + "'\n");
    }
}
