package LLD.Design_Patterns.Observer_Design_Pattern;

import LLD.Design_Patterns.Observer_Design_Pattern.Observable.IPhoneStockObservableImpl;
import LLD.Design_Patterns.Observer_Design_Pattern.Observable.IStockObservable;
import LLD.Design_Patterns.Observer_Design_Pattern.Observer.EmailNotificationObserverImpl;
import LLD.Design_Patterns.Observer_Design_Pattern.Observer.INotificationObserver;
import LLD.Design_Patterns.Observer_Design_Pattern.Observer.SMSNotificationObserverImpl;

public class Store {
    public static void main(String[] args) {
        IStockObservable iphoneObservable = new IPhoneStockObservableImpl();

        INotificationObserver observer1 = new EmailNotificationObserverImpl(iphoneObservable, "abc.xyz@ymail.com");
        INotificationObserver observer2 = new EmailNotificationObserverImpl(iphoneObservable, "pqr.xyz@ymail.com");
        INotificationObserver observer3 = new SMSNotificationObserverImpl(iphoneObservable, "+91-8456325478");
        INotificationObserver observer4 = new SMSNotificationObserverImpl(iphoneObservable, "+91-9569852633");

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);
        iphoneObservable.add(observer4);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(100);
        iphoneObservable.setStockCount(20);
    }
}
