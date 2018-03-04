package pl.sda.poznan.observer;

public class StockObserver implements Observer<Stock> {

    private Stock stockToObserve;

    public StockObserver(Stock stockToObserve) {
        this.stockToObserve = stockToObserve;
        this.stockToObserve.subscribe(this);
    }

    @Override
    public void handle(PropertyChangeEventArgs<Stock> args) {
        System.out.println("Value that has changed: " + args.getPropertyName());
        System.out.println("Old value: " + args.getOldValue());
        System.out.println("New value: " + args.getNewValue());
    }
}
