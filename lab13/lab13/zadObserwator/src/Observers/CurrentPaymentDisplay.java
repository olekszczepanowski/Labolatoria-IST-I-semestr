package Observers;

import Observable.Subject;
import additionalActions.DisplayInCurrencies;

public class CurrentPaymentDisplay implements Observer, DisplayInCurrencies {

    private float amount;
    private boolean byCard;

    private Subject paymentData;

    public CurrentPaymentDisplay(Subject paymentData){
        this.paymentData = paymentData;
        this.paymentData.registerObserver(this);

    }


    @Override
    public void update(float amount, boolean byCard) {
        this.amount = amount;
        this.byCard = byCard;
        display();
    }

    public void display(){
        String stringAmount = String.format("%.2f",amount);
        System.out.print("\nStatus platnosci:\nKwota: "+stringAmount+" zl. Metoda platności: ");
        if(byCard){
            System.out.print("karta.");
        }
        else{
            System.out.print("gotowka.");
        }
        displayEuro();
        displayDollars();
    }

    @Override
    public void displayEuro() {
        float amountInEuro = (float) (amount/4.71);
        String stringAmountInEuro = String.format("%.2f",amountInEuro);
        System.out.print("\nKwota w walucie euro: "+stringAmountInEuro);
    }

    @Override
    public void displayDollars() {
        float amountInDollar = (float) (amount/4.35);
        String stringAmountInDollar = String.format("%.2f",amountInDollar);
        System.out.print("\nKwota w walucie euro: "+stringAmountInDollar);
    }
}
