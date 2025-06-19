package com.paddu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        String csvFile = "item_data.csv";
        List<Item> items = new ArrayList<>();

        // Step 1: Read CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                long itemId = Long.parseLong(parts[0]);
                String name = parts[1];
                String category = parts[2];
                items.add(new Item(itemId, name, category));
            }
        }

        // Step 2: Collect unique keywords/categories
        Set<String> keywords = items.stream()
            .map(item -> item.getCategory().toLowerCase())
            .collect(Collectors.toCollection(TreeSet::new)); // alphabetically sorted

        System.out.println("Available categories:");
        keywords.forEach(keyword -> System.out.println(" - " + keyword));

        // Step 3: Let user pick one
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a category or keyword to search: ");
        String input = scanner.nextLine().toLowerCase();

        // Step 4: Show matches
        List<Item> filteredItems = items.stream()
            .filter(item -> item.getName().toLowerCase().contains(input) ||
                            item.getCategory().toLowerCase().contains(input))
            .collect(Collectors.toList());

        System.out.println("\nItems matching '" + input + "':");
        if (filteredItems.isEmpty()) {
            System.out.println("  No matching items found.");
        } else {
            for (Item item : filteredItems) {
                System.out.println("  Item ID: " + item.getItemId() +
                                   ", Name: " + item.getName() +
                                   ", Category: " + item.getCategory());
            }
        }
    }

    static class Item {
        private long itemId;
        private String name;
        private String category;

        public Item(long itemId, String name, String category) {
            this.itemId = itemId;
            this.name = name;
            this.category = category;
        }

        public long getItemId() { return itemId; }
        public String getName() { return name; }
        public String getCategory() { return category; }
    }
}
