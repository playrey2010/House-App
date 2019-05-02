package com.company;

public class HouseApp {

    public static void main(String[] args) {
        House a = new House();
        a.setFloors(2);
        a.setWindows(10);
        a.setDoors(3);
        a.setSqft(2000);
        a.setSalesPrice("$300,000");

        System.out.println("My present home has " + a.getFloors() + " floors," + " " + a.getWindows() + " windows," + " and  "
                + a.getDoors() + " doors. It is " + a.getSqft() + " sq ft and worth " + a.getSalesPrice() + ".");

        House b = new House();
        b.setFloors(3);
        b.setWindows(20);
        b.setDoors(4);
        b.setSqft(4000);
        b.setSalesPrice("$600,000");

        System.out.println("My future home has " + b.getFloors() + " floors," + " " + b.getWindows() + " windows," + " and  "
                + b.getDoors() + " doors. It is " + b.getSqft() + " sq ft and worth " + b.getSalesPrice() + ".");
    }
}
