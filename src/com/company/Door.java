package com.company;

public class Door {
    private String doorMaterial;
    private int amtOfDoors;

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
