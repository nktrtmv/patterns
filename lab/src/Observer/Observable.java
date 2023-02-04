package Observer;

public interface Observable {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObservers(Observer o, String info);
}
