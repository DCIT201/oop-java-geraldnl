package model;
import service.Customer;

public class Motorcycle extends Vehicle implements Rentable {
    private static final double MOTORCYCLE_RATE = 20;

    public Motorcycle(String vehicleId, String model) {
        super(vehicleId, model, MOTORCYCLE_RATE);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Motorcycle rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Motorcycle is not available for rent.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle returned.");
    }
}
