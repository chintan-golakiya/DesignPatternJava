package com.billplanfactorypattern.factory;

import com.billplanfactorypattern.billplan.BillPlan;
import com.billplanfactorypattern.billplan.DomesticPlan;
import com.billplanfactorypattern.billplan.InternationalPlan;

public class BillPlanFactory {
	public BillPlan getBillPlan(String planName) {
		if(planName.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (planName.equalsIgnoreCase("Internationalplan")) {
			return new InternationalPlan();
		}
		System.out.println("Invalid Plan "+planName);
		return null;
	}
}
