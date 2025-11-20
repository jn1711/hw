abstract class Payment{
    abstract void processPayment();
}

class CreditCardPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Credit Card");
    }
}

class BankTransferPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Bank Transfer");
    }
}

class DigitalWallet extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Digital Wallet");
    }
}

class PaymentProcessor {
    public void process(Payment payment){
        if (payment instanceof CreditCardPayment) {
            System.out.println("Credit Card Payment");
        }else if(payment instanceof BankTransferPayment){
            System.out.println("Bank Transfer Payment");
        }else if(payment instanceof DigitalWallet){
            System.out.println("Digital Wallet Payment");
        }
    }
}

public class Pmnt {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment bankTransferPayment = new BankTransferPayment();
        Payment digitalWallet = new DigitalWallet();

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.process(digitalWallet);
        paymentProcessor.process(bankTransferPayment);
        paymentProcessor.process(creditCardPayment);
    }
}