package main.java.by.tc.task01.service.validation;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

public class OvenValidator extends Validator {
    
    
    @Override
    public boolean isCriteriaCorrect(String criteriaName) {
        
        for (SearchCriteria.Oven ovenCriteria : SearchCriteria.Oven.values()) {
            
            if (criteriaName.equalsIgnoreCase(ovenCriteria.toString())) {
                
                return true;
            }
        }
        
        return false;
        
    }


}
