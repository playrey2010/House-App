package com.company;

import java.util.Scanner;

public class Door {
    private String doorMaterial;
    private int amtOfDoors;

    public void inputDoor(Scanner sc) {
        System.out.print("Please enter the door material: ");
        setDoorMaterial(sc.nextLine());
        System.out.print("Please enter the amount of doors: ");
        setAmtOfDoors(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "There are " + getAmtOfDoors() + " doors made out of " + getDoorMaterial() + ".";
    }

    public String getDoorMaterial() {
        return doorMaterial;
    }

    public void setDoorMaterial(String doorMaterial) {
        this.doorMaterial = doorMaterial;
    }

    public int getAmtOfDoors() {
        return amtOfDoors;
    }

    public void setAmtOfDoors(int amtOfDoors) {
        this.amtOfDoors = amtOfDoors;
    }
}
