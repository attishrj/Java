 package com.java.design.pattern.visitor;

public interface Visitor {
	
	public double visit(Liquor liquorItem);
	public double visit(Tobacco tobaccoItem);
	public double visit(Necessity necessityItem);

}
