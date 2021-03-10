package CollectionHierarchy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myListImpl = new MyListImpl();
        Arrays.stream(input).forEach(e -> System.out.printf("%d ",addCollection.add(e)));
        System.out.println();
        Arrays.stream(input).forEach(e -> System.out.printf("%d ",addRemoveCollection.add(e)));
        System.out.println();
        Arrays.stream(input).forEach(e -> System.out.printf("%d ",myListImpl.add(e)));
        System.out.println();
        IntStream.range(0,n).forEach(e -> System.out.printf("%s ",addRemoveCollection.remove()));
        System.out.println();
        IntStream.range(0,n).forEach(e -> System.out.printf("%s ",myListImpl.remove()));


    }
}
