package Observable;

import Observers.Observer;

import java.util.ArrayList;

public class PaymentData implements Subject{


    ArrayList<Observer> ObserverList = new ArrayList<>( );

    private float amount;

    private boolean byCard;

    public void setPayment(float amount, boolean byCard){
        this.amount = amount;
        this.byCard = byCard;
        paymentChanged();
    }

    public void paymentChanged(){
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        ObserverList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        ObserverList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i<ObserverList.size();i++){
            ObserverList.get(i).update(amount,byCard);
        }
    }
}
