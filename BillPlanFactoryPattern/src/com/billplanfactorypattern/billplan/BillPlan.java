package com.billplanfactorypattern.billplan;

public interface BillPlan {
	int getRate();
	int calculateBill(int units);
}
