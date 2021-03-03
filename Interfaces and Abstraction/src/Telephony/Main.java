package Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> telephoneNumber = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        List<String> url = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

    }
}
