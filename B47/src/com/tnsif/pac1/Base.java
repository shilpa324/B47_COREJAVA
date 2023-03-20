package com.tnsif.pac1;

public class Base {
   int varDefault = 10;
   public int varPublic = 20;
   private int varPrivate = 30;
   protected int varProtected = 40;
   
   void methodDefault() {
	   System.out.println("default access base class");
	   System.out.println("default variable"+varDefault);
   }
   
   public void methodPublic() {
	   System.out.println("public base class");
	   System.out.println("default variable"+varPublic);
   }
   
   private void methodPrivate() {
	   System.out.println("private access base class");
	   System.out.println("default variable"+varPrivate);
   }
   protected void methodProtected() {
	   System.out.println("protected access base class");
	   System.out.println("default variable"+varProtected);
   }
}
