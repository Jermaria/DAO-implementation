package main.java.by.tc.task01.main;

import static main.java.by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.ArrayList;
import java.util.List;

import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;
import main.java.by.tc.task01.service.ApplianceService;
import main.java.by.tc.task01.service.ServiceFactory;
import main.java.by.tc.task01.service.exception.ServiceException;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliances = new ArrayList<Appliance>();

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 3);
		
		try {
		    
		    appliances = service.find(criteriaOven);
		
		} catch (ServiceException e) {
		    
		    System.out.println(e.getMessage());
		}
		

		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 300);
		
		try {
		    
		    appliances = service.find(criteriaOven);
		
		} catch (ServiceException e) {
            
            System.out.println(e.getMessage());
        }
		
		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);

		try {
            
		    appliances = service.find(criteriaOven);// find(Object...obj)

		} catch (ServiceException e) {
            
            System.out.println(e.getMessage());
        }
        
		PrintApplianceInfo.print(appliances);

	}

}
