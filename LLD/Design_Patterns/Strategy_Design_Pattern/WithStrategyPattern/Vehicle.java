package LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern;

import LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern.DriveStrategy.DriveStrategy;

/**
 * Vehicle
 */
public class Vehicle {

    private DriveStrategy strategy;

    public Vehicle(DriveStrategy strategy) {
        this.strategy = strategy;
    }

    public void drive() {
        strategy.drive();
    }

    public DriveStrategy getDriveStrategy() {
        return this.strategy;
    }
}
