package pl.sda.poznan.chor;

public class PaypassPaymentHandler extends PaymentHandler {

    private static final int MAX_PRICE_TO_HANDLE = 50;

    @Override
    protected void handle(BankAccount account, double amountToPay) {
        System.out.println("Platnosc zblizeniowa jest realizowana....");
        account.setAmount(account.getAmount() - amountToPay);
        System.out.println("Zaplacono zblizeniowo..........");
    }

    @Override
    protected double getMaxPrice() {
        return MAX_PRICE_TO_HANDLE;
    }
}
