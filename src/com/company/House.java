package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class House {

    private ArrayList<Floor> floors;
    private Window window;
    private Door door;
    private int sqFt;
    private double salesPrice;

    public House(){
    }

    public void inputAllInformation (Scanner sc) {
        inputFloors(sc);
        window = new Window();
        window.inputWindow(sc);
        door = new Door();
        door.inputDoor(sc);
        inputSqFeet(sc);
        inputSalesPrice(sc);
    }

    public void inputSqFeet (Scanner sc) {
        System.out.print("Please enter the amount of square feet: ");
        setSqFt(sc.nextInt());
        sc.nextLine();
    }

    public void inputSalesPrice(Scanner sc) {
        System.out.print("Please enter the sales price for the house: ");
        setSalesPrice(sc.nextDouble());
        sc.nextLine();
    }

    public void inputFloors (Scanner sc) {
        int limit = 0;
        Floor floor;
        ArrayList<Floor> tempFloors = new ArrayList<>();

        System.out.print("Please enter the amount of floors: ");
        limit = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<limit; i++) {
            floor = new Floor();
            floor.inputFloor(sc);
            tempFloors.add(floor);
        }

        setFloors(tempFloors);
    }

    public String displayFloorsInfo() {
        String info = "It has ";
        for (int i = 0; i<floors.size(); i++) {
            if (i >= 1) {
                info += " and ";
            }
            info += floors.get(i).toString();
        }
        info += ". ";
        return info;
    }

    @Override
    public String toString() {
        String info = "This is your house: \n";
        info += displayFloorsInfo() + "\n" + getWindow().toString() + "\n" + getDoor().toString()
                + "\n" + "It is " + getSqFt() + " square feet and is up for sale at " + getSalesPrice() + ".";
        return info;
    }

    public House(ArrayList<Floor> floors, Window window, Door door, int sqFt, double salesPrice) {
        this.floors = floors;
        this.window = window;
        this.door = door;
        this.sqFt = sqFt;
        this.salesPrice = salesPrice;
    }
//    public House(int floors){
//        this.floors = floors;

//    }
//    public House(int floors, int windows, int doors, int sqFt, double salesPrice) {
//        this.floors = floors;
//        this.windows = windows;
//        this.doors = doors;
//        this.sqFt = sqFt;
//        this.salesPrice = salesPrice;
//    }
//
//    public void setFloors(int floors){
//        this.floors = floors;
//    }
//    public int getFloors(){
//        return floors;
//    }
//
//    public int getWindows() {
//        return windows;
//    }
//
//    public void setWindows(int windows) {
//        this.windows = windows;
//    }
//
//    public int getDoors() {
//        return doors;
//    }
//
//    public void setDoors(int doors) {
//        this.doors = doors;

//    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    public String getSalesPrice() {
        NumberFormat df2 = NumberFormat.getCurrencyInstance();
        df2.setMinimumFractionDigits(2);
        df2.setMaximumFractionDigits(2);
        return df2.format(salesPrice);
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

//    @Override
//    public String toString(){
//        return getFloors() + " floors " +
//                getWindows() + " windows " +
//                getDoors() + " doors. It is " +
//                getSqFt() + " sq ft and worth $" +
//                getSalesPrice();
//    }
}
