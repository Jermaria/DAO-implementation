package main.java.by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.Laptop;
import main.java.by.tc.task01.entity.Oven;
import main.java.by.tc.task01.entity.Refrigerator;
import main.java.by.tc.task01.entity.Speakers;
import main.java.by.tc.task01.entity.TabletPC;
import main.java.by.tc.task01.entity.VacuumCleaner;

class ApplianceCreator {
    
    List<Appliance> create(List<String> matchingAppliances) {
        
        List<Appliance> appliances = new ArrayList<Appliance>();    
        
        ApplianceReader reader = new ApplianceReader();
        
  
        for (String applianceInfo : matchingAppliances) {
            
            String[] parsedApplianceInfo = applianceInfo.split(" ");
            
            String applianceType = parsedApplianceInfo[0];
            
            Map<String, String> params = reader.extractApllianceConfiguration(parsedApplianceInfo);
            
            Appliance appliance = createCertainAppliance(applianceType, params);
            
            appliances.add(appliance);
          
        }
        
        return appliances;  
      }
    
    Appliance createCertainAppliance(String applianceType, Map<String, String> params) {
        
        Appliance newAppliance;
        
        if (applianceType.equalsIgnoreCase("Laptop")) {
            
            newAppliance = createLaptop(params);
            
        } else if (applianceType.equalsIgnoreCase("Oven")) {
            
            newAppliance = createOven(params);
        
        } else if (applianceType.equalsIgnoreCase("Refrigerator")) {
            
            newAppliance = createRefrigerator(params);
        
        } else if (applianceType.equalsIgnoreCase("TabletPC")) {
            
            newAppliance = createTabletPC(params);
            
        } else if (applianceType.equalsIgnoreCase("Speakers")) {
            
            newAppliance = createSpeakers(params);
            
        } else if (applianceType.equalsIgnoreCase("Vacuumcleaner")) {
            
            newAppliance = createVacuumCleaner(params);
            
        } else {
            
            newAppliance = null;
        }
        
        return newAppliance;
    }
      

    Laptop createLaptop(Map<String, String> params){
          
        Laptop newAppliance = new Laptop();
          
        for (Map.Entry <String, String> parameter : params.entrySet()) {
              
            String criteriaName = parameter.getKey();
            String criteriaValue = parameter.getValue();
              
            if (criteriaName.equalsIgnoreCase("battery_capacity")) {
                  
                newAppliance.setBatteryCapacity(Double.parseDouble(criteriaValue));
              
            } else if(criteriaName.equalsIgnoreCase("OS")) {
                  
                newAppliance.setOs(criteriaValue);
              
            } else if (criteriaName.equalsIgnoreCase("memory_rom")) {
                  
                newAppliance.setMemoryROM(Integer.parseInt(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("system_memory")) {
                  
                newAppliance.setSystemMemory(Integer.parseInt(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("cpu")) {
                  
                newAppliance.setCpu(Double.parseDouble(criteriaValue));
                  
            } else if (criteriaName.equalsIgnoreCase("display_inchs")) {
                  
                newAppliance.setDisplayInchs(Integer.parseInt(criteriaValue));
            }
        }
          
        return newAppliance;
      
    }
      
    TabletPC createTabletPC(Map<String, String> params) { 
          
        TabletPC newAppliance = new TabletPC();
          
        for (Map.Entry <String, String> parameter : params.entrySet()) {
              
            String criteriaName = parameter.getKey();
            String criteriaValue = parameter.getValue();
          
            if (criteriaName.equalsIgnoreCase("battery_capacity")) {
                  
                newAppliance.setBatteryCapacity(Integer.parseInt(criteriaValue));
              
            } else if(criteriaName.equalsIgnoreCase("display_inches")) {
                  
                newAppliance.setDisplayInches(Double.parseDouble(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("memory_rom")) {
                  
                newAppliance.setMemoryROM(Integer.parseInt(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("color")) {
                  
                newAppliance.setColour(criteriaValue);
              
            } else if (criteriaName.equalsIgnoreCase("flash_memory_capacity")) {
                  
                newAppliance.setFlashMemoryCapacity(Integer.parseInt(criteriaValue));
                  
            } 
        }
          
        return newAppliance;
      
    }
      
    Oven createOven(Map<String, String> params) {
          
        Oven newAppliance = new Oven();
          
        for  (Map.Entry <String, String> parameter : params.entrySet()) {
             
            String criteriaName = parameter.getKey();
            String criteriaValue = parameter.getValue();
          
            if (criteriaName.equalsIgnoreCase("POWER_CONSUMPTION")) {
                  
                newAppliance.setPowerConsumption(Integer.parseInt(criteriaValue));
              
            } else if(criteriaName.equalsIgnoreCase("WEIGHT")) {
                  
                newAppliance.setWeight(Double.parseDouble(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("CAPACITY")) {
                  
                newAppliance.setCapacity(Integer.parseInt(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("DEPTH")) {
                  
                newAppliance.setDepth(Double.parseDouble(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("HEIGHT")) {
                  
                newAppliance.setHeight(Double.parseDouble(criteriaValue));
                  
            }  else if (criteriaName.equalsIgnoreCase("WIDTH")) {
                  
                newAppliance.setWidth(Double.parseDouble(criteriaValue));
                  
            } 
              
        }
          
        return newAppliance;
          
    }
    
    Refrigerator createRefrigerator(Map<String, String> params) {
        
        Refrigerator newAppliance = new Refrigerator();
        
        for  (Map.Entry <String, String> parameter : params.entrySet()) {
            
            String criteriaName = parameter.getKey();
            String criteriaValue = parameter.getValue();
          
            if (criteriaName.equalsIgnoreCase("POWER_CONSUMPTION")) {
                  
                newAppliance.setPowerConsumption(Integer.parseInt(criteriaValue));
              
            } else if(criteriaName.equalsIgnoreCase("WEIGHT")) {
                  
                newAppliance.setWeight(Double.parseDouble(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("FREEZER_CAPACITY")) {
                  
                newAppliance.setFreezerCapacity(Integer.parseInt(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("OVERALL_CAPACITY")) {
                  
                newAppliance.setOverallCapacity(Double.parseDouble(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("HEIGHT")) {
                  
                newAppliance.setHeight(Double.parseDouble(criteriaValue));
                  
            }  else if (criteriaName.equalsIgnoreCase("WIDTH")) {
                  
                newAppliance.setWidth(Double.parseDouble(criteriaValue));
                  
            } 
              
        }
        
        return newAppliance;
        
    }
    
    Speakers createSpeakers(Map<String, String> params) {
        
        Speakers newAppliance = new Speakers();
        
        for  (Map.Entry <String, String> parameter : params.entrySet()) {
            
            String criteriaName = parameter.getKey();
            String criteriaValue = parameter.getValue();
          
            if (criteriaName.equalsIgnoreCase("POWER_CONSUMPTION")) {
                  
                newAppliance.setPowerConsumption(Integer.parseInt(criteriaValue));
              
            } else if(criteriaName.equalsIgnoreCase("NUMBER_OF_SPEAKERS")) {
                  
                newAppliance.setNumberOfSpeakers(Integer.parseInt(criteriaValue));
              
            } else if (criteriaName.equalsIgnoreCase("FREQUENCY_RANGE")) {
                  
                newAppliance.setFrequencyRange(criteriaValue);
              
            } else if (criteriaName.equalsIgnoreCase("CORD_LENGTH")) {
                  
                newAppliance.setCordLength(Double.parseDouble(criteriaValue));
              
            } 
            
        }
        
        return newAppliance;
    }
    
    VacuumCleaner createVacuumCleaner(Map<String, String> params) {
        
        VacuumCleaner newAppliance = new VacuumCleaner();
        
        for  (Map.Entry <String, String> parameter : params.entrySet()) {
            
            String criteriaName = parameter.getKey();
            String criteriaValue = parameter.getValue();
          
            if (criteriaName.equalsIgnoreCase("POWER_CONSUMPTION")) {
                  
                newAppliance.setPowerConsumption(Integer.parseInt(criteriaValue));
              
            } else if(criteriaName.equalsIgnoreCase("FILTER_TYPE")) {
                  
                newAppliance.setFilterType(criteriaValue.charAt(0));
              
            } else if (criteriaName.equalsIgnoreCase("BAG_TYPE")) {
                  
                newAppliance.setBagType(criteriaValue);
              
            } else if (criteriaName.equalsIgnoreCase("WAND_TYPE")) {
                  
                newAppliance.setWandType(criteriaValue);
              
            } else if (criteriaName.equalsIgnoreCase("MOTOR_SPEED_REGULATION")) {
                
              newAppliance.setMotorSpeedRegulation(Integer.parseInt(criteriaValue));
            
            } else if (criteriaName.equalsIgnoreCase("CLEANING_WIDTH")) {
                
              newAppliance.setCleaningWidth(Double.parseDouble(criteriaValue));
            
            }
 
        }
        
        return newAppliance;
        
    }
    

}
