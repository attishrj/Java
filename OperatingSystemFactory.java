package com.java.design.pattern.factory.phone;

public class OperatingSystemFactory {
	
	public OS getInstance(String objType)
	{
		if(objType.equals("Android"))
		{
			return new Android();
		}
		if(objType.equals("IOS"))
		{
			return new IOS();
		}
		else
		{
			return new Windows();
		}
	}

}
