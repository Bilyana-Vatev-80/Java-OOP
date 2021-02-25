package SortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            people.add(new Person(input[0],input[1], Integer.parseInt(input[2])));
        }
        Collections.sort(people,(f,s) -> {
            int comp = f.getFirstName().compareTo(s.getFirstName());
            if(comp != 0){
                return comp;
            } else {
                return Integer.compare(f.getAge(),s.getAge());
            }
        });

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
