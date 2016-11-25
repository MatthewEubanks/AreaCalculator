/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalculator;

import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class AreaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=_");
        System.out.println("\n1) Triangle");
        System.out.println("2) Rectangle");
        System.out.println("3) Square");
        System.out.println("4) Circle");
        System.out.println("5) Quit");
        System.out.print("Which Shape: ");
        int shape = keyboard.nextInt();
        while (shape != 5) {
            
            if (shape == 1) {
                System.out.print("Base: ");
                int base = keyboard.nextInt();
                System.out.print("Height: ");
                int height = keyboard.nextInt();
                System.out.println("\nThe area is " + area_triangle(base, height) + ".");
            } else if (shape == 2) {
                System.out.print("Length: ");
                int length = keyboard.nextInt();
                System.out.print("Width: ");
                int width = keyboard.nextInt();
                System.out.println("\nThe area is " + area_rectangle(length, width) + ".");
            } else if (shape == 3) {
                System.out.print("Side Length: ");
                int side = keyboard.nextInt();
                System.out.println("\nThe area is " + area_square(side) + ".");
            } else if (shape == 4) {
                System.out.print("Radius: ");
                int radius = keyboard.nextInt();
                System.out.println("\nThe area is " + area_circle(radius) + ".");
            }
            System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=_");
            System.out.println("\n1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Circle");
            System.out.println("5) Quit");
            System.out.print("Which Shape: ");
            shape = keyboard.nextInt();
        }

    }

    public static double area_triangle(int base, int height) {
        double triArea;
        triArea = (base * height) / 2;
        return triArea;

    }

    public static int area_rectangle(int length, int width) {
        int rectArea;
        rectArea = length * width;
        return rectArea;

    }

    public static int area_square(int side) {
        int sqrArea;
        sqrArea = side * side;
        return sqrArea;
    }

    public static double area_circle(int radius) {
        double cirArea = Math.PI * (radius * radius);
        return cirArea;

    }

}
