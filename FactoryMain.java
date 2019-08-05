package com.java.design.pattern.factory;

import com.java.design.pattern.factory.phone.OS;
import com.java.design.pattern.factory.phone.OperatingSystemFactory;

public class FactoryMain {

	public static void main(String[] args) {
	/**This is not the correct 
	 * , as it exposes everything
	 * to the client**/ 
		
		
	/*	OS obj=new Android();
		OS obj=new Windows();
		obj.specs();*/
		
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj=	osf.getInstance("Windows");
		obj.specs();

	}

}
