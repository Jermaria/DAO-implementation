package main.java.by.tc.task01.service.validation;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPCValidator extends Validator {
    
    @Override
    public boolean isCriteriaCorrect(String criteriaName) {
        
        for (SearchCriteria.TabletPC tabletPCCriteria : SearchCriteria.TabletPC.values()) {
            
            if (criteriaName.equalsIgnoreCase(tabletPCCriteria.toString())) {
                
                return true;
            }
        }
        
        return false;
        
    }

}
