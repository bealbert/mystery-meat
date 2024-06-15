package org.bealbert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirtualMenu {

    private static final List<String> categories = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private static void setCategories() {
        categories.add("FFXIV");
        categories.add("Jewelry");
        categories.add("Accessories");
        categories.add("VTubers");
        categories.add("Pokemon");
        categories.add("See All Products");
    }

    public static List<String> getCategories() {
        return categories;
    }

    public static void main(String[] args) {
        VirtualMenu virtualMenu = new VirtualMenu();
        virtualMenu.run();
    }

    public void run() {
        System.out.println("Thank you for visiting the MysteryMeat website! Please select an option to view: ");
        System.out.println("1: View Product Categories");
        System.out.println("2: View Shopping Cart");
        System.out.println("3: Artist Profiles");
        System.out.println("4: Exit");
        System.out.print("Select menu option: ");
        String userInput = scanner.nextLine();


        if(userInput.equals("1")) {
            setCategories();
            int menuNum = 1;
            for(String category : categories) {
                System.out.println(menuNum + ": " + category);
                menuNum += 1;
            }
            System.out.print("Please select a Product Category to view: ");
            String productInput = scanner.nextLine();

            //if product input is 2: list jewelry
            //if 3: list accessories
            //if 4: list vtubers
            //if 5: pokemon
            //if 6: list everything (woof)
            if(productInput.equals("1")) {
                int itemNum = 1;

                //if product input is 1: list ff14 items
                //do i need a class that is ff14 that implements the class "category"?? i think i might
            } else if (productInput.equals("2")) {

            }
        } else if (userInput.equals("2")) {

            //list items added to shopping cart, include total of all prices added together
            //call a method from shopping cart class to do this
        } else if(userInput.equals("3")) {
            //view artist profiles
            System.out.println("Artists: ");
            System.out.println("-------------------");
            System.out.println("1: Kitty");
            System.out.println("2: Car");
            System.out.println("Please select the Artist Profile you wish to view: ");
            String input = scanner.nextLine();
        }else {
            //exit program...
        }

    }
}