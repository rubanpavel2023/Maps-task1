package src.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Stock {

    private Map<String, Integer> fruits;
    private boolean isFirstList = true;

    public Stock() {
        this.fruits = new HashMap<>();
    }

    public void addFruit(String productName, int quantity, int position) {
        if (position < 1 || position > fruits.size() + 1) {
            System.out.println("The fruit added to the end of the list");
            position = fruits.size() + 1;
        }
        Map<String, Integer> newFruits = new LinkedHashMap<>();
        AtomicInteger current = new AtomicInteger(1);

        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            if (current.get() == position) {
                newFruits.put(productName, quantity);
            }
            newFruits.put(entry.getKey(), entry.getValue());
            current.incrementAndGet();
        }
        if (current.get() <= position) {
            newFruits.put(productName, quantity);
        }
        fruits = newFruits;
    }


    AtomicInteger counter = new AtomicInteger(1);
    public void printFruitsList() {
        if (isFirstList) {
            System.out.println("--Initial data--");
            isFirstList = false;
        } else {
            System.out.println("--Updated data--");
            counter.set(1);
        }

        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            String productName = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(counter.getAndIncrement() + ") " + productName + ", " + quantity + " kg");
        }
        System.out.println();

    }

}

