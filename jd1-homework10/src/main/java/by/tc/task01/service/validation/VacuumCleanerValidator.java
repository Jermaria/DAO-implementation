package main.java.by.tc.task01.service.validation;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

public class VacuumCleanerValidator extends Validator {
    
    @Override
    public boolean isCriteriaCorrect(String criteriaName) {
        
        for (SearchCriteria.VacuumCleaner vacuumCleanerCriteria : SearchCriteria.VacuumCleaner.values()) {
            
            if (criteriaName.equalsIgnoreCase(vacuumCleanerCriteria.toString())) {
                
                return true;
            }
        }
        
        return false;
        
    }

}
