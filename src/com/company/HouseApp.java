package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");

        House houseA = new House();
        houseA.inputAllInformation(sc);
        System.out.println("=================================================");
        System.out.println(houseA.toString());
    }
}
