/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        System.out.printf("What is the length of the room in feet? ");
        Scanner scanner = new Scanner(System.in);
        String length = scanner.nextLine();
        int newlength = Integer.parseInt(length);
        System.out.printf("What is the width of the room in feet? ");
        Scanner scanner1 = new Scanner(System.in);
        String width = scanner1.nextLine();
        int newwidth = Integer.parseInt(width);
        double sqft;
        sqft = newwidth * newlength;
        int paintreq = (int)Math.ceil(sqft/350);
        int sq = (int)sqft;
        System.out.printf("You will need to purchase " + paintreq + " gallons of paint to cover up " + sq + " square feet. ");

    }
}