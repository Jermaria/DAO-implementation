package main.java.by.tc.task01.service.validation;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

public class RefrigeratorValidator extends Validator {
    
    @Override
    public boolean isCriteriaCorrect(String criteriaName) {
        
        for (SearchCriteria.Refrigerator refrigeratorCriteria : SearchCriteria.Refrigerator.values()) {
            
            if (criteriaName.equalsIgnoreCase(refrigeratorCriteria.toString())) {
                
                return true;
            }
        }
        
        return false;
        
    }

}
