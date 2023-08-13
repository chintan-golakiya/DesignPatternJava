import com.billplanfactorypattern.billplan.BillPlan;
import com.billplanfactorypattern.factory.BillPlanFactory;

/**
 * 
 */
/**
 * @author chintan-golakiya
 *
 */
public class BillPlanFactoryPattern {
	public static void main(String[] args) {
		BillPlanFactory billPlanFactory = new BillPlanFactory();
		int units = 4;
		BillPlan domestic = billPlanFactory.getBillPlan("domesticplan");
		System.out.println("domestic plan rate: "+domestic.getRate() + 
				", units:" +units + 
				", bill:"+domestic.calculateBill(units));
		
		BillPlan international = billPlanFactory.getBillPlan("internationalplan");
		System.out.println("international plan rate: "+international.getRate() + 
				", units:" +units + 
				", bill:"+international.calculateBill(units));
		
		billPlanFactory.getBillPlan("random");
	}
}