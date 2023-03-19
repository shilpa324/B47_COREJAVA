package com.tnsif.p;
/*
 * program to demonstrate class and objects
 */
public class Car {
	int model;//Datamemebers
	String color;
	int reg=123;
	int amount=900000;
	//member function
	void forward() {
		System.out.println("Car is moving forward direction");
	}
    void backward() {
    	System.out.println("Car is moving backward direction");
    }
    void stop() {
    	System.out.println("Car is not moving");
    }
}
