package main.java.by.tc.task01.service.validation;

import java.util.Map;

import main.java.by.tc.task01.entity.criteria.Criteria;
import main.java.by.tc.task01.entity.criteria.SearchCriteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		// you may add your own code here
	    String groupSearchName = criteria.getGroupSearchName();
	    
	    if (isGroupSearchNameValid(groupSearchName)) {
	        
	        if (criteria.getCriteria() == null) {
	            
	            return true;
	        
	        } else {
	            
	            Validator validator;
	            
	            if (groupSearchName.equalsIgnoreCase("oven")) {
	                
	                validator = new OvenValidator();

	            } else if (groupSearchName.equalsIgnoreCase("laptop")) {
	                
	                validator = new LaptopValidator();
	                
	            } else if (groupSearchName.equalsIgnoreCase("tabletPC")) {
                    
                    validator = new TabletPCValidator();
                    
                } else if (groupSearchName.equalsIgnoreCase("refrigerator")) {
                    
                    validator = new RefrigeratorValidator();
                    
                } else if (groupSearchName.equalsIgnoreCase("speakers")) {
                    
                    validator = new SpeakersValidator();
                    
                } else if (groupSearchName.equalsIgnoreCase("vacuumcleaner")) {
                    
                    validator = new VacuumCleanerValidator();
                    
                } else {
                    validator = null;
                }
	            
	            for (String criteriaName : criteria.getCriteria().keySet()) {
	                
	                if(!validator.isCriteriaCorrect(criteriaName)) {
	                    
	                    return false;
	                }
	            }
	            
	            return true;
	        }	       
	    }
		
		return false;
	}
	
	static boolean isGroupSearchNameValid(String groupSearchName) {         //make private?
	    
	   Class[] availableAppliances = SearchCriteria.class.getDeclaredClasses();
	   
	   for (Class currentAppliance : availableAppliances) {
	      
	       String currentApplianceName = currentAppliance.getSimpleName();
	       
	       if (groupSearchName.equalsIgnoreCase(currentApplianceName)) {
	           return true;
	       }
	       
	   }
	    
	   return false;
	    
	}
	
	public boolean isCriteriaCorrect(String criteriaName) {
	    
	   return false;
	}

}



//you may add your own new classes