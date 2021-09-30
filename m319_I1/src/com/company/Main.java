package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int e = 0;
        do {

            int count;
            double in;
            double allcount = 0;
            double out = 0;
            String yn;
            Scanner sc = new Scanner(System.in);
            System.out.println("How many tests? There have to be at least 3 marks.");
            count = sc.nextInt();
            if (count <= 2) {
                System.out.println("Please enter at least 3");
            } else {

                for (int i = 1; i != count + 1; i++) {
                    System.out.println("Enter the " + i + ". Mark:");
                    in = sc.nextDouble();
                    if (in > 6 || in < 1) {
                        System.out.println("This is not a valid number.");
                        i--;
                    } else {
                        out = ((out * allcount) + in) / (allcount + 1);
                        allcount++;
                    }
                }
                System.out.println("Your average mark is: " + out);
                e = 0;
                do {
                    System.out.println("Do you want to enter other marks? Yes or no?");
                    yn = sc.next();
                    if (yn.equals("yes") || yn.equals("Yes") || yn.equals("Y") || yn.equals("y")) {e = 2;}
                    else if (yn.equals("no") || yn.equals("No") || yn.equals("N") || yn.equals("n")) {System.out.println("Okay, Goodbye!");e = 1;}
                    else {System.out.println("This is not a valid input.");}
                } while (e != 1 && e != 2);
            }
        } while (e != 1);
}
}