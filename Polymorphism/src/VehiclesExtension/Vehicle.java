package VehiclesExtension;

public abstract class Vehicle implements VehicleInterface{
    private double fuelQuantity;
    private double fuelConsumption;
    private double fuelCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption,double fuelCapacity){
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
        setFuelCapacity(fuelCapacity);
    }

    protected void setFuelCapacity(double fuelCapacity){
        this.fuelCapacity = fuelCapacity;
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

    public double getFuelCapacity() {
        return this.fuelCapacity;
    }
}
