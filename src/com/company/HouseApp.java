package com.company;

import java.util.Scanner;

public class HouseApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RealEstate myRE = new RealEstate();
        System.out.println("=================================================");
        myRE.inputHouses(sc);
        System.out.println("=================================================");
        System.out.println(myRE.toString());

    }
}
