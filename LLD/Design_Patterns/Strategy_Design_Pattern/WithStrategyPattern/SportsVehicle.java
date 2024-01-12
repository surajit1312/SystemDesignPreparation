package LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern;

import LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern.DriveStrategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
