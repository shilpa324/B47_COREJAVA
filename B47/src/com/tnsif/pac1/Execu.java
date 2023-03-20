package com.tnsif.pac1;

public class Execu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Base b = new Base();
      b.methodDefault();
      b.methodProtected();
      b.methodPublic();
      
      b.varDefault=21;
      b.methodDefault();
      b.varPublic=65;
      b.methodPublic();
      
      System.out.println("b instance of Base");
	}

}
