package LLD.Design_Patterns.Observer_Design_Pattern.Observer;

import LLD.Design_Patterns.Observer_Design_Pattern.Observable.IStockObservable;

public class SMSNotificationObserverImpl implements INotificationObserver {
    @SuppressWarnings("unused")
    private IStockObservable observable;
    private String phoneNumber;

    public SMSNotificationObserverImpl(IStockObservable ob, String phoneNumber) {
        this.observable = ob;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println("Notified via SMS to phone number : " + this.phoneNumber + ". Message : " + message);
    }

}
