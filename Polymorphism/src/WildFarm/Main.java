package WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        String input = scanner.nextLine();

        while (!"End".equals(input)){
            String[] tokens = input.split("\\s+");
            Animal animal = createAnimal(tokens);


            String[] provideFood = scanner.nextLine().split("\\s+");
            Food food = createFood(provideFood);

            animal.makeSound();
            try {
                animal.eat(food);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

             animals.add(animal);

            input = scanner.nextLine();
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }

    private static Food createFood(String[] provideFood) {
        String typeFood = provideFood[0];
        Integer quantity = Integer.parseInt(provideFood[1]);

        return typeFood.equals("Meat") ? new Meat(quantity) : new Vegetable(quantity);
        }

    private static Animal createAnimal(String[] tokens) {
        String animalType = tokens[0];
        String animalName = tokens[1];
        double animalWeight = Double.parseDouble(tokens[2]);
        String animalLivingRegion = tokens[3];
        Animal animal;
        switch (animalType){
            case "Cat":
                animal = new Cat(animalName,animalType,animalWeight,animalLivingRegion,tokens[4]);
                break;
            case "Tiger":
                animal = new Tiger(animalName,animalType,animalWeight,animalLivingRegion);
                break;
            case "Zebra":
                animal = new Zebra(animalName,animalType,animalWeight,animalLivingRegion);
                break;
            case "Mouse":
                animal = new Mouse(animalName,animalType,animalWeight,animalLivingRegion);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + animalType);
        }
      return animal;
    }
}
