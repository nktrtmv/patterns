package Observer;

import java.util.ArrayList;

public class PoliceStation implements Observable {
    private final ArrayList<Observer> colleagues;

    public PoliceStation() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void deleteObserver(Observer post) {
        int index = colleagues.indexOf(post);
        if (index >= 0) {
            colleagues.remove(index);
        }
    }

    @Override
    public void notifyObservers(Observer reportedPost, String area) {
        for (Observer post : colleagues) {
            if (post != reportedPost) {
                post.getReport("traffic violation", area, "car number");
            }
        }
    }
}
