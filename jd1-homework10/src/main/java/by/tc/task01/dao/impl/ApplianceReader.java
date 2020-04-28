package main.java.by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.by.tc.task01.entity.criteria.Criteria;

    class ApplianceReader {
    
    private Criteria criteria;
    
    ApplianceReader() {} //убрать паблик

    ApplianceReader(Criteria criteria){
      this.criteria = criteria;
    }
    
    
    List<String> find() throws FileNotFoundException, IOException {      
        
        List<String> finalApplianceData = new ArrayList<String>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader("resources/appliances_db.txt"))) {
            
            String applianceData;
                
            while((applianceData = reader.readLine()) != null) {
            
                if(criteriaMatcher(applianceData)) {
              
                    finalApplianceData.add(applianceData);
                }    
            }  
        
            reader.close();
        }
        
        return finalApplianceData;
    }
    
    
    boolean criteriaMatcher(String data) {
        
        String[] applianceDetails = data.split(" ");
        
        if (criteria.getGroupSearchName().equalsIgnoreCase(applianceDetails[0])) {
            
            if (criteria.getCriteria() == null) {   //подойдут все приборы указанного типа
                
                return true;
            
            } else {
                
                if (areCriteriaMatching(applianceDetails)) {
                    
                    return true;
                }    
            }
        }
  
        return false; 
    
    }
    
    boolean areCriteriaMatching(String[] applianceDetails) {
        
        for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
            
            String currentCriteriaName = entry.getKey();
            String currentCriteriaValue = entry.getValue().toString();
            
            Map<String, String> availableConfigurations = extractApllianceConfiguration(applianceDetails);
            
            for (Map.Entry<String, String> configuration : availableConfigurations.entrySet()) {
                
                String availableConfigurationName = configuration.getKey();
                String availableConfigurationValue = configuration.getValue();
                
                if (currentCriteriaName.equalsIgnoreCase(availableConfigurationName)) {
                    
                    if (!currentCriteriaValue.equalsIgnoreCase(availableConfigurationValue)) {
                        
                        return false;
                    }
                    
                }
            }
        }
        
        return true;
    }
    
    Map<String, String> extractApllianceConfiguration(String[] applianceDetails) {
        
        Map<String, String> configuration = new HashMap<String, String>(); 
        
        for (int i = 2; i < applianceDetails.length; i++ ) {
            
            String criteriaName = applianceDetails[i].replaceAll("=.+", "");
            String criteriaValue = applianceDetails[i].replaceAll("[A-Z]+[_]?[A-Z]+=", "").replaceAll("[,;]$", "");
            
            configuration.put(criteriaName, criteriaValue);
        }
        
        return configuration;
    }


}
