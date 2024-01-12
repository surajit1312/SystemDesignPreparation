package LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern;

import LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern.DriveStrategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
