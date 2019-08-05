package com.java.design.pattern.visitor;

public class TaxVisitorTest {
	public static void main(String[] args) {
		
	TaxVisitor calculator=new TaxVisitor();
	RevisedTaxVisitor revised=new RevisedTaxVisitor();
	
	Necessity milk=new Necessity(17);
	Liquor vodka=new Liquor(105);
	Tobacco light=new Tobacco(20);
	System.out.println("For One Tax Calculator");
	System.out.println(milk.accept(calculator));
	System.out.println(vodka.accept(calculator));
	System.out.println(light.accept(calculator));
	
	System.out.println("For Second Tax Calculator");
	System.out.println(milk.accept(revised));
	System.out.println(vodka.accept(revised));
	}

}
