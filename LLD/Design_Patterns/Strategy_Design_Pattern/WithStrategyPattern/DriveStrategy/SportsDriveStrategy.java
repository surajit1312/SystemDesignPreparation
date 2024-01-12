package LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }

}
