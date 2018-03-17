package pl.sda.poznan.chor;

import java.awt.dnd.InvalidDnDOperationException;

public abstract class PaymentHandler {

    protected PaymentHandler nextHendler;

    public void setNextHendler(PaymentHandler nextHendler) {
        this.nextHendler = nextHendler;
    }

    public void processPayment(BankAccount bankAccount, double amount) {
        if (canHandlePayment(amount)) {
            handle(bankAccount, amount);
        } else if (nextHendler != null) {
            nextHendler.processPayment(bankAccount, amount);
        } else {
            throw new InvalidDnDOperationException("Nie jestem w stanie obsluzyc platnosci. Kwota zbyt duza");
        }
    }

    private boolean canHandlePayment(double amount) {
        return amount < getMaxPrice();
    }

    protected abstract void handle(BankAccount account, double amount);

    protected abstract double getMaxPrice();
}
