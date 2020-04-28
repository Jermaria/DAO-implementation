package main.java.by.tc.task01.service.validation;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

public class SpeakersValidator extends Validator{
    
    @Override
    public boolean isCriteriaCorrect(String criteriaName) {
        
        for (SearchCriteria.Speakers speakersCriteria : SearchCriteria.Speakers.values()) {
            
            if (criteriaName.equalsIgnoreCase(speakersCriteria.toString())) {
                
                return true;
            }
        }
        
        return false;
        
    }

}
