package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
       String productsOutput = this.products.isEmpty()
               ? "Nothing bought"
               : this.products.stream()
               .map(Product::getName)
               .collect(Collectors.joining(", "));

       return name + " - " + productsOutput;
    }

    public void buyProduct( Product product) {
        if (this.money > product.getCost()) {
            this.products.add(product);
            this.money -= product.getCost();
            System.out.printf("%s bought %s%n", this.name, product.getName());
        } else {
            System.out.printf("%s can't afford %s%n", this.name, product.getName());
        }
    }

}
