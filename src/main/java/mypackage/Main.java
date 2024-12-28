package mypackage;

import model.Car;
import model.Motorcycle;
import model.Truck;
import service.Customer;
import service.RentalAgency;

public class Main {
    public static void main(String[] args) {
        // Create instances of vehicles
        Car car = new Car("C001", "Toyota");
        Motorcycle motorcycle = new Motorcycle("M001", "Harley Davidson");
        Truck truck = new Truck("T001", "Ford");

        // Create a rental agency
        RentalAgency agency = new RentalAgency();
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Create a customer
        Customer customer = new Customer("CUST001", "John Doe");

        // Calculate rental costs
        int rentalDays = 5;
        double carRentalCost = car.calculateRentalCost(rentalDays);
        double motorcycleRentalCost = motorcycle.calculateRentalCost(rentalDays);
        double truckRentalCost = truck.calculateRentalCost(rentalDays);

        // Print out the rental costs
        System.out.println("Car rental cost for " + rentalDays + " days: " + carRentalCost);
        System.out.println("Motorcycle rental cost for " + rentalDays + " days: " + motorcycleRentalCost);
        System.out.println("Truck rental cost for " + rentalDays + " days: " + truckRentalCost);
    }
}
