package LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }

}
