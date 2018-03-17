package pl.sda.poznan.chor;

public class Program {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("PKO dla mlodych", 4000);
        bankAccount.setPin("1234");

        PaypassPaymentHandler paypassPaymentHandler = new PaypassPaymentHandler();
        PinPaymentHandler pinPaymentHandler = new PinPaymentHandler();
        paypassPaymentHandler.setNextHendler(pinPaymentHandler);

        paypassPaymentHandler.processPayment(bankAccount, 40000);

    }
}
