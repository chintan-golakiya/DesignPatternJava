package com.billplanfactorypattern.billplan;

public class DomesticPlan implements BillPlan {
	int rate;
	
	public DomesticPlan() {
		this.rate = 10;
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
