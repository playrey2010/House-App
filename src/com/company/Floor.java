package com.company;

import java.util.Scanner;

public class Floor {
    private String tileMaterial;
    private int amtOfTiles;

    public void inputFloor(Scanner sc) {
        System.out.print("Please enter the tile material: ");
        setTileMaterial(sc.nextLine());
        System.out.print("Please enter the amount of tiles: ");
        setAmtOfTiles(sc.nextInt());
        sc.nextLine();
    }


    public String getTileMaterial() {
        return tileMaterial;
    }

    public void setTileMaterial(String tileMaterial) {
        this.tileMaterial = tileMaterial;
    }

    public int getAmtOfTiles() {
        return amtOfTiles;
    }

    public void setAmtOfTiles(int amtOfTiles) {
        this.amtOfTiles = amtOfTiles;
    }

    public String toString() {
        return "a floor with " + getAmtOfTiles() + " tiles made of " + getTileMaterial();
    }
}
