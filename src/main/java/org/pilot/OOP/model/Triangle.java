package org.pilot.OOP.model;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: Khan
 */
public class Triangle extends Shape{

    @Override
    public void printArea() {
        System.out.println("The area of Triangle is " + width * length);
    }
}
