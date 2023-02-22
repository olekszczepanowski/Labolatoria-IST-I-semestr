package Observers;

import Observable.Subject;
import additionalActions.DisplayInCurrencies;

public class AmountOfLoan implements Observer, DisplayInCurrencies {

    private float amount;

    private Subject paymentData;

    public AmountOfLoan(Subject paymentData){
        this.paymentData = paymentData;
        this.paymentData.registerObserver(this);
    }

    public float CalculateAmountOfLoan(){
        return (float) (amount*1.21);
    }


    @Override
    public void update(float amount, boolean byCard) {
        this.amount = amount;
        display();
    }


    public void display(){
        String stringAmountOfLoan = String.format("%.2f",CalculateAmountOfLoan());
        System.out.println("\nKwota do zaplaty po wzieciu pozyczki w zlotowkach: "+stringAmountOfLoan);
        displayEuro();
        displayDollars();
    }
    @Override
    public void displayEuro() {
        float amountOfLoanEuro = (float) (CalculateAmountOfLoan()/4.71);
        String stringAmountOfLoanEuro = String.format("%.2f",amountOfLoanEuro);
        System.out.println("Kwota do zaplaty po wzieciu pozyczki w euro: "+stringAmountOfLoanEuro);
    }

    @Override
    public void displayDollars() {
        float amountOfLoanDollars = (float) (CalculateAmountOfLoan()/4.35);
        String stringAmountOfLoanDollars = String.format("%.2f",amountOfLoanDollars);
        System.out.println("Kwota do zaplaty po wzieciu pozyczki w dolarach: "+stringAmountOfLoanDollars);
    }
}
