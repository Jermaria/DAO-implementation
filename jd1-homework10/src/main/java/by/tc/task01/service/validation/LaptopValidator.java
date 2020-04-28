package main.java.by.tc.task01.service.validation;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

public class LaptopValidator extends Validator {
    
    @Override
    public boolean isCriteriaCorrect(String criteriaName) {
        
        for (SearchCriteria.Laptop laptopCriteria : SearchCriteria.Laptop.values()) {
            
            if (criteriaName.equalsIgnoreCase(laptopCriteria.toString())) {
                
                return true;
            }
        }
        
        return false;
        
    }

}
