package military;

public class Repair {
    private String name;
    private int houseWorked;

    public Repair(String name, int houseWorked) {
        this.name = name;
        this.houseWorked = houseWorked;
    }

    public String getName() {
        return name;
    }

    public int getHouseWorked() {
        return houseWorked;
    }

    @Override
    public String toString() {
        return String.format("  Part Name: %s Hours Worked: %d",this.getName(),this.houseWorked);
    }
}
