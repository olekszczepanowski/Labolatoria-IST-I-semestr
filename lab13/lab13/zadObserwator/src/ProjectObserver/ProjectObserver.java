package ProjectObserver;

import Observable.PaymentData;
import Observers.AmountOfLoan;
import Observers.CurrentPaymentDisplay;



public class ProjectObserver {
    public static void main(String[] args) {
        PaymentData paymentData = new PaymentData();
        CurrentPaymentDisplay paymentDisplay = new CurrentPaymentDisplay(paymentData);
        AmountOfLoan amountOfLoan = new AmountOfLoan(paymentData);

        System.out.println("Platnosc 1:");
        paymentData.setPayment(1000,true);
        System.out.println("--------------------------------------------");
        System.out.println("Platnosc 2:");
        paymentData.setPayment(1500,false);
        System.out.println("--------------------------------------------");
        System.out.println("Platnosc 3:");
        paymentData.setPayment(2700,false);
        System.out.println("--------------------------------------------");
    }
}
