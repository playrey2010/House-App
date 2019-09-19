package com.company;

public class Floor {
    private String tileMaterial;
    private int amtOfTiles;


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
