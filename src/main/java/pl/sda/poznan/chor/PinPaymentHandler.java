package pl.sda.poznan.chor;

import java.util.Scanner;

public class PinPaymentHandler extends PaymentHandler {

    public static final int MAX_PRICE_TO_HANDLE = 500;

    @Override
    protected void handle(BankAccount account, double amountToPay) {
        System.out.println("Platnosc uwierzytelniana pinem...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pin");
        String pin = scanner.next();

        if (pin.equals(account.getPin())) {
            System.out.println("Ptrzetwarzanie....");
            account.setAmount(account.getAmount() - amountToPay);
        } else {
            throw new IllegalStateException("Invalid pin");
        }

    }

    @Override
    protected double getMaxPrice() {
        return MAX_PRICE_TO_HANDLE;
    }
}
