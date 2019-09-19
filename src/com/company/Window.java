package com.company;

public class Window {
    private String windowMaterial;
    private String windowShape;
    private int amtOfWindows;

    @Override
    public String toString() {
        return "There are " + getAmtOfWindows() + " " + getWindowShape() + " windows made of " + getWindowMaterial() + ".";
    }

    public String getWindowMaterial() {
        return windowMaterial;
    }

    public void setWindowMaterial(String windowMaterial) {
        this.windowMaterial = windowMaterial;
    }

    public String getWindowShape() {
        return windowShape;
    }

    public void setWindowShape(String windowShape) {
        this.windowShape = windowShape;
    }

    public int getAmtOfWindows() {
        return amtOfWindows;
    }

    public void setAmtOfWindows(int amtOfWindows) {
        this.amtOfWindows = amtOfWindows;
    }
}
