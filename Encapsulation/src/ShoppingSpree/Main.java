package ShoppingSpree;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people;
        Map<String,Product> products;
        try {
            people = setPeople (scanner);
            products = setProducts (scanner);
        }catch (IllegalArgumentException ex){
            System.out.println (ex.getMessage ());
            return;
        }

        String command = scanner.nextLine ();

        while (!"END".equals (command)){
            String[] tokens = command.split ("\\s+");

            people.get (tokens[0]).buyProduct (products.get (tokens[1]));

            command = scanner.nextLine ();
        }


        for (Person person : people.values()) {
            System.out.println(person.toString());
        }


    }

    private static
    Map<String, Product> setProducts (Scanner scanner) {
        Map<String,Product> products = new LinkedHashMap<> ();
        String[] productsInfo = scanner.nextLine ().split (";");
        for (String info : productsInfo) {
            String[] tokens = info.split("=");
            Product product = new Product(tokens[0], Double.parseDouble(tokens[1]));
            products.put(tokens[0],product);
        }
        return products;
    }

    private static
    Map<String, Person> setPeople (Scanner scanner) {
        Map<String,Person> people = new LinkedHashMap<> ();
        String[] peopleInfo = scanner.nextLine ().split (";");
        for (String info : peopleInfo) {
            String[] tokens = info.split ("=");
            Person person = new Person (tokens[0],Double.parseDouble (tokens[1]) );
            people.put (tokens[0],person );
        }
        return people;
    }

}
