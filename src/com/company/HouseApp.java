package com.company;

import java.util.ArrayList;

public class HouseApp {

    public static int getFloors(){
        int floors = 5;
        return floors;
    }

    public static void main(String[] args) {

        ArrayList<House> myHomes = new ArrayList<House>();

        House a = new House();

        a.setFloors(2);
        a.setWindows(10);
        a.setDoors(3);
        a.setSqft(2000);
        a.setSalesPrice("$300,000");
        myHomes.add(a);

        System.out.println("My present home has " + getFloors()  + " or " + a.getFloors() + " floors," + " " + a.getWindows() + " windows," + " and  "
                + a.getDoors() + " doors. It is " + a.getSqft() + " sq ft and worth " + a.getSalesPrice() + ".");

        House b = new House();
        b.setFloors(3);
        b.setWindows(20);
        b.setDoors(4);
        b.setSqft(4000);
        b.setSalesPrice("$600,000");
        myHomes.add(b);

        System.out.println("My future home has " + b.getFloors() + " floors," + " " + b.getWindows() + " windows," + " and  "
                + b.getDoors() + " doors. It is " + b.getSqft() + " sq ft and worth " + b.getSalesPrice() + ".");

        for (House h:myHomes){
            System.out.println("My square footage is "+ h.getSqft());
        }

    }
}
