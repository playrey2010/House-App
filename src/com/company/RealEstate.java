package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class RealEstate {
    private ArrayList<House> houses;


    // getters setters
    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    // methods
    @Override
    public String toString() {
        String info = "These are your houses: \n";
        for (House house: getHouses()) {
            info += house.toString() + "\n";
        }
        return info;
    }

    public void inputHouses(Scanner sc) {
        ArrayList<House> tempHouses = new ArrayList<>();
        House house;
        System.out.print("Please enter the amount of houses you own: ");
        int limit = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<limit; i++) {
            house = new House();
            System.out.println("\nYou will now enter the information for house #" + (i+1));
            house.inputAllInformation(sc);
            tempHouses.add(house);
        }
        setHouses(tempHouses);
    }
}
