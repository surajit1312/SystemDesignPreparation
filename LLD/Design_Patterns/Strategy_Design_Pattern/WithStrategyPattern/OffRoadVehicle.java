package LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern;

import LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern.DriveStrategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
