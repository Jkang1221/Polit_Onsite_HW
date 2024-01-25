package org.pilot.OOP.model;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: Khan
 */
public class Circle extends Shape{
    @Override
    public void printArea() {
        System.out.println("The area of circle is " + width * length);
    }
}
