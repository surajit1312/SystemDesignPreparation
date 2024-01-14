package LLD.Design_Patterns.Observer_Design_Pattern.Observable;

import LLD.Design_Patterns.Observer_Design_Pattern.Observer.INotificationObserver;

public interface IStockObservable {
    public void add(INotificationObserver observer);

    public void remove(INotificationObserver observer);

    public void notifySubscribers();

    public void setStockCount(int stockCount);

    public int getStockCount();
}
