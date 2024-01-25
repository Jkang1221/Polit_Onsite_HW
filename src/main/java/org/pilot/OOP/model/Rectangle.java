package org.pilot.OOP.model;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: Khan
 */
public class Rectangle extends Shape {

    @Override
    public void printArea() {
        System.out.println("The area of Rectangle is " + width * length);
    }
}
