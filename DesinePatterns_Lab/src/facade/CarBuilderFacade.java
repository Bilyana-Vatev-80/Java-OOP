package facade;

public class CarBuilderFacade {
    protected Car car;

    public void CarBuilderFacade(){
        this.car = new Car();
    }

    public Car build(){
        return this.car;
    }

    public CarInfoBuilder info(){
        return new CarInfoBuilder(this.car);
    }

    public CarAddressBuilder built(){
        return new CarAddressBuilder(this.car);
    }
}
