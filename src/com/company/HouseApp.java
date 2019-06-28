package com.company;

public class HouseApp {

    public static void main(String[] args) {
        House presentHome = new House(2, 10, 3, 2000, 30000);
        presentHome.setSalesPrice(35000);
        System.out.println("My present home has " + presentHome.toString());

        House futureHome = new House();
        futureHome.setDoors(15);
        futureHome.setFloors(6);
        futureHome.setSalesPrice(150000.998);
        futureHome.setSqFt(1500);
        futureHome.setWindows(20);
        System.out.println("My future home has " + futureHome.toString());

    }
}
