package LLD.Design_Patterns.Strategy_Design_Pattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new PassengerVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new OffRoadVehicle();
        vehicle3.drive();
    }
}
