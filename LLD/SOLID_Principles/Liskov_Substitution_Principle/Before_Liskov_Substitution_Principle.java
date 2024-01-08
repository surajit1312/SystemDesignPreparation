package LLD.SOLID_Principles.Liskov_Substitution_Principle;

import java.util.ArrayList;
import java.util.List;

public class Before_Liskov_Substitution_Principle {

    static class Vehicle {
        void turnOnEngine() {

        }

        void accelerate() {

        }

        void applyBrake() {

        }
    }

    static class MotorCycle extends Vehicle {

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

    static class Car extends Vehicle {

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
        public void turnOnEngine() {
            throw new AssertionError("There is no engine!");
        }

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
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        vehicles.add(new BiCycle());

        for (Vehicle vehicle : vehicles) {
            vehicle.turnOnEngine();
        }
    }
}
