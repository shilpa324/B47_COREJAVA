package com.tnsif.p;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car ob=new Car();// creation of object
        ob.backward();//calling the member function of the Car
        ob.forward();
        ob.stop();
        
        System.out.println("reg is"+ob.reg);
        System.out.println("reg is"+ob.amount);
	}

}
