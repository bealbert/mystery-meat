package org.bealbert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MysteryMeat {

    private static List<String> categories = new ArrayList<>();

    private static void setCategories() {
        categories.add("FFXIV");
        categories.add("Jewelry");
        categories.add("Accessories");
        categories.add("VTubers");
        categories.add("Pokemon");
        categories.add("See All");
    }

    public static void main(String[] args) {
        MysteryMeat mysteryMeat = new MysteryMeat();
        mysteryMeat.run();


    }

    public void run() {
        System.out.println("Thank you for visiting the MysteryMeat website! Please select an option to view: ");
        System.out.println("1: View Product Categories");
        System.out.println("2: View Shopping Cart");
        System.out.println("3: Artist Profiles");
        System.out.println("4: Exit");
        System.out.print("Select menu option: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        if(userInput.equals("1")) {
            for(String category : categories) {
                int menuNum = 1;
                System.out.println("Please select a Product Category to view: ");
                System.out.println(menuNum + ": " + category);
                Scanner scanner1 = new Scanner(System.in);
                String productInput = scanner1.nextLine();

            }

        }
    }
}