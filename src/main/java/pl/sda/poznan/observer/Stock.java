package pl.sda.poznan.observer;

public class Stock extends Observable<Stock> {
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double oldPrice = this.price;
        if (price == oldPrice) {
            return;
        }
        this.price = price;
        propertyChanged(new PropertyChangeEventArgs<>(this, "price", this.price, oldPrice));
    }

    //Alternatywny zapis (jezeli ceny takie same to wroc z funkcji - redukujemy zagniezdzenia)
    public void set(double price) {
        if (this.price == price) {
            return;
        }
        double oldPrice = price;
        this.price = price;
        propertyChanged(new PropertyChangeEventArgs<>(this, "price", this.price, oldPrice));
    }

    //wykonuj tylko jezeli ceny sa rozne
    public void setPriceWithValidation(double price) {
        double oldPrice = price;
        this.price = price;
        if (oldPrice != this.price) {
            propertyChanged(new PropertyChangeEventArgs<>(this, "price", this.price, oldPrice));
        }
    }

    public String getName() {
        return name;
    }
}


