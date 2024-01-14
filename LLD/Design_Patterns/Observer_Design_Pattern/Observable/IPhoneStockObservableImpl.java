package LLD.Design_Patterns.Observer_Design_Pattern.Observable;

import java.util.ArrayList;
import java.util.List;

import LLD.Design_Patterns.Observer_Design_Pattern.Observer.INotificationObserver;

public class IPhoneStockObservableImpl implements IStockObservable {

    List<INotificationObserver> observerList = new ArrayList<INotificationObserver>();
    int stockCount = 0;
    String message = "";

    @Override
    public void add(INotificationObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(INotificationObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (INotificationObserver observer : this.observerList) {
            observer.update(this.message);
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if (stockCount == 0) {
            this.stockCount = 0;
        } else {
            this.stockCount += stockCount;
        }
        this.message = this.stockCount > 0 ? "Item is in stock. Count : " + this.stockCount : "Item is out of stock";
        this.notifySubscribers();
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

}
