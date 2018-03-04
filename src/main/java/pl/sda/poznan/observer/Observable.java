package pl.sda.poznan.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public void subscribe(Observer<T> observer) {
        this.observers.add(observer);
    }

    protected void propertyChanged(PropertyChangeEventArgs eventArgs) {
        for (Observer<T> o : observers) {
            o.handle(eventArgs);
        }
    }
}
