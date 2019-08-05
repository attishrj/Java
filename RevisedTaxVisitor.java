package com.java.design.pattern.visitor;

import java.text.DecimalFormat;

public class RevisedTaxVisitor implements Visitor {


	
	DecimalFormat df=new DecimalFormat("#.##");

	public RevisedTaxVisitor() {
	}

	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item: Price with Tax");
		return Double.parseDouble(df.format(liquorItem.getPrice()*10)+liquorItem.getPrice());
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		return Double.parseDouble(df.format(tobaccoItem.getPrice()*22)+tobaccoItem.getPrice());
	}

	@Override
	public double visit(Necessity necessityItem) {
		return Double.parseDouble(df.format(necessityItem.getPrice()*5)+necessityItem.getPrice());
	}

}
