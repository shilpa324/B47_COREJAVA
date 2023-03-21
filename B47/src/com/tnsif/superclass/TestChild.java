package com.tnsif.superclass;
class TestParent{
	void test() {
		System.out.println("This is a parent class");
	}
}
public class TestChild extends TestParent {
	void test() {
		System.out.println("This is a child class");
	}
void display() {
	test();
	super.test();
}

}
