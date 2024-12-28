package model;

import service.Customer;

public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}


