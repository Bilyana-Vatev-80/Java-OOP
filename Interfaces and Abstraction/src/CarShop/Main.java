package CarShop;

public class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon", "gray", 110, "Spain", 11111.1);

        System.out.printf (
                "%s is %s color and have %s horse power%n",
                seat.getModel (),
                seat.getColor (),
                seat.getHorsePower ());
        System.out.println (seat.toString ());
    }
}
