package com.billplanfactorypattern.billplan;

public class InternationalPlan implements BillPlan {
	int rate;
	
	public InternationalPlan() {
		rate = 20;
	}
	
	@Override
	public int getRate() {
		return rate;
	}

	@Override
	public int calculateBill(int units) {
		return rate*units;
	}
}

