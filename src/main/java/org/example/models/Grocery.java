package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Grocery {

    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void startGrocery() {

    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            if (!checkItemIsInList(item)) {
                groceryList.add(item);
            }
        }
        removeDuplicatesAndSort();
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            groceryList.remove(item);
        }
        removeDuplicatesAndSort();
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        removeDuplicatesAndSort();
        System.out.println("Grocery List: " + groceryList);
    }

    private static void removeDuplicatesAndSort() {
        Set<String> set = new HashSet<>(groceryList);
        groceryList.clear();
        groceryList.addAll(set);
        Collections.sort(groceryList);
    }
}