package LLD.SOLID_Principles.Liskov_Substitution_Principle;

import java.util.ArrayList;
import java.util.List;

public class After_Liskov_Substitution_Principle {
    static class Vehicle {

        void accelerate() {

        }

        void applyBrake() {

        }
    }

    static class EngineVehicle extends Vehicle {

        public void turnOnEngine() {

        }

        void accelerate() {

        }

        void applyBrake() {

        }
    }

    static class MotorCycle extends EngineVehicle {

        boolean isEngineOn = false;
        int speed;

        @Override
        public void turnOnEngine() {
            // turn on engine
            isEngineOn = true;
        }

        @Override
        public void accelerate() {
            // increase the speed
            speed = speed + 20;
        }

        @Override
        public void applyBrake() {
            // decrease the speed
            speed = speed - 20;
        }

    }

    static class Car extends EngineVehicle {

        boolean isEngineOn = false;
        int speed;

        @Override
        public void turnOnEngine() {
            // turn on engine
            isEngineOn = true;
        }

        @Override
        public void accelerate() {
            // increase the speed
            speed = speed + 20;
        }

        @Override
        public void applyBrake() {
            // decrease the speed
            speed = speed - 20;
        }

    }

    static class BiCycle extends Vehicle {

        boolean isEngineOn = false;
        int speed;

        @Override
        public void accelerate() {
            // increase the speed
            speed = speed + 5;
        }

        @Override
        public void applyBrake() {
            // decrease the speed
            speed = speed - 5;
        }

    }

    public static void main(String[] args) {
        accessVehicles();
        accessEngineVehicles();
    }

    private static void accessVehicles() {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        vehicles.add(new BiCycle());

        for (Vehicle vehicle : vehicles) {
            // vehicle.turnOnEngine();
        }
    }

    private static void accessEngineVehicles() {
        List<EngineVehicle> vehicles = new ArrayList<EngineVehicle>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        // vehicles.add(new BiCycle());

        for (EngineVehicle vehicle : vehicles) {
            vehicle.turnOnEngine();
        }
    }
}
