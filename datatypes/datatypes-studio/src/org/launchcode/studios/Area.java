package org.launchcode.studios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Area {
    public static void main(String Arg[]){
        System.out.println("Enter a radius:");
        Scanner input = new Scanner(System.in);
        double radius=input.nextDouble();
//        System.out.println(3.14 *radius*radius);
        System.out.println(circle.getArea(radius));
    }
}

