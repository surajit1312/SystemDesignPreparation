package LLD.Design_Patterns.Observer_Design_Pattern.Observer;

import LLD.Design_Patterns.Observer_Design_Pattern.Observable.IStockObservable;

public class EmailNotificationObserverImpl implements INotificationObserver {
    @SuppressWarnings("unused")
    private IStockObservable observable;
    private String email;

    public EmailNotificationObserverImpl(IStockObservable ob, String email) {
        this.observable = ob;
        this.email = email;
    }

    @Override
    public void update(String message) {
        sendEmail(message);
    }

    private void sendEmail(String message) {
        System.out.println("Notified via SMS to phone number : " + this.email + ". Message : " + message);
    }
}
