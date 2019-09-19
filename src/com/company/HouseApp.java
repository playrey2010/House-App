package com.company;

import java.util.ArrayList;

public class HouseApp {

    public static void main(String[] args) {
//        House presentHome = new House(2, 10, 3, 2000, 30000);
//        presentHome.setSalesPrice(35000);
//        System.out.println("My present home has " + presentHome.toString());
//
//        House futureHome = new House();
//        futureHome.setDoors(15);
//        futureHome.setFloors(6);
//        futureHome.setSalesPrice(150000.998);
//        futureHome.setSqFt(1500);
//        futureHome.setWindows(20);
//        System.out.println("My future home has " + futureHome.toString());
        House house = new House();

        // creating and setting floors
        ArrayList<Floor> floors = new ArrayList<>();
        Floor floorA = new Floor();
        floorA.setAmtOfTiles(30);
        floorA.setTileMaterial("wood");
        floors.add(floorA);
        Floor floorB = new Floor();
        floorB.setTileMaterial("ceramic");
        floorB.setAmtOfTiles(40);
        floors.add(floorB);

        house.setFloors(floors);

        //creating/setting Window
        Window window = new Window();
        window.setAmtOfWindows(15);
        window.setWindowShape("square");
        window.setWindowMaterial("vinyl");

        house.setWindow(window);

        //creating/setting Door
        Door d = new Door();
        d.setAmtOfDoors(20);
        d.setDoorMaterial("wood");
        house.setDoor(d);

        // set the rest
        house.setSqFt(30000);
        house.setSalesPrice(1000000);
        System.out.println(house.toString());

    }
}
