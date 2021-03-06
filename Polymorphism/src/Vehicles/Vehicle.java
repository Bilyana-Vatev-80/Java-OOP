package Vehicles;

public abstract class Vehicle implements VehicleInterface{
    private double fuelQuantity;
    private double fuelConsumption;
    
    public Vehicle(double fuelQuantity, double fuelConsumption){
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
    }

    public void setFuelQuantity(double fuelQuantity){
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }
}
