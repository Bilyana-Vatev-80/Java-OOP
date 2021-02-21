package PO4_TraficcLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] startColor = scanner.nextLine().split("\\s+");
        int countUpdates = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String color: startColor) {
            TrafficLight trafficLight = new TrafficLight(Color.valueOf(color));
            trafficLights.add(trafficLight);
        }
        for (int i = 0; i < countUpdates; i++) {
            for (TrafficLight light : trafficLights) {
                light.update();
                System.out.print(light.getColor() + " ");
            }
            System.out.println();
        }
    }
}
