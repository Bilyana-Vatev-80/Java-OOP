package Telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable,Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        correctNumber(numbers);
        correctUrls(urls);
    }

    private void correctUrls(List<String> urls) {
        this.urls =  new ArrayList<>();
        for (String url : urls) {
            boolean urlsIsValid = true;
            for (char c : url.toCharArray()) {
                if(Character.isDigit(c)){
                    this.urls.add("Invalid URL!");
                    urlsIsValid = false;
                    break;
                }
            }
            if(urlsIsValid){
                this.urls.add(url);
            }
        }
    }

    private void correctNumber(List<String> numbers) {
        this.numbers = new ArrayList<>();
        for (String number : numbers) {
            boolean numberIsValid = true;
            for (char c : number.toCharArray()) {
                if(!Character.isDigit(c)) {
                    this.numbers.add("Invalid numbers!");
                    numberIsValid = false;
                    break;
                }
            }
            if(numberIsValid){
                this.numbers.add(number);
            }
        }

    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            sb.append("Browsing: ").append(url).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            sb.append("Calling ... ").append(number).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
