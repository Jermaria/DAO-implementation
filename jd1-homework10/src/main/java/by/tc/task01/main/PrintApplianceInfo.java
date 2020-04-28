package main.java.by.tc.task01.main;

import java.lang.reflect.Field;
import java.util.List;

import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.Laptop;
import main.java.by.tc.task01.entity.Oven;
import main.java.by.tc.task01.entity.Refrigerator;
import main.java.by.tc.task01.entity.Speakers;
import main.java.by.tc.task01.entity.TabletPC;
import main.java.by.tc.task01.entity.VacuumCleaner;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {

	    String type = appliance.getClass().getSimpleName();
	    
	    if (type.equalsIgnoreCase("laptop")) {
	        
	        Laptop laptop = (Laptop)appliance;
	        printLaptopInfo(laptop);
	    
	    } else if (type.equalsIgnoreCase("oven")) {
	        
	        Oven oven = (Oven)appliance;
	        printOvenInfo(oven);
	    
	    } else if (type.equalsIgnoreCase("refrigerator")) {
	        
	        Refrigerator fridge = (Refrigerator)appliance;
	        printRefrigeratorInfo(fridge);
	        
	    } else if(type.equalsIgnoreCase("speakers")) {
	        
	        Speakers speakers = (Speakers)appliance;
	        printSpeakersInfo(speakers);
	        
	    } else if (type.equalsIgnoreCase("tabletPC")) {
	        
	        TabletPC tablet = (TabletPC)appliance;
	        printTabletPCInfo(tablet);
	        
	    } else if (type.equalsIgnoreCase("vacuumcleaner")) {
	        
	        VacuumCleaner hoover = (VacuumCleaner)appliance;
	        printVacuumCleanerInfo(hoover);
	    }
		
	}
	
	public static void print(List<Appliance> appliances) {
	    
	    int num = 1;
	    for (Appliance app : appliances) {
	        
	        System.out.print(app.getClass().getSimpleName() + " №" + num + ": ");
	        
	        print(app);
	    }
	}
	
	public static void printLaptopInfo(Laptop laptop) {
	    
	    System.out.println("Battery capacity: " + laptop.getBatteryCapacity() 
	                        + "; CPU: " + laptop.getCpu() 
	                        + "; Inches: " + laptop.getDisplayInchs()
	                        + "; ROM: " + laptop.getMemoryROM() 
	                        + "; OS: " + laptop.getOs() 
	                        + "; System Memory " + laptop.getSystemMemory());
	}
	
	public static void printOvenInfo(Oven oven) {
	    
	    System.out.println(" Capacity: " + oven.getCapacity() 
	                        + "; Depth: " + oven.getDepth() 
	                        + "; Height: " + oven.getHeight()
	                        + "; Power Consumption: " + oven.getPowerConsumption()
	                        + "; Weight: " + oven.getWeight()
	                        + "; Width: " + oven.getWidth());
	}
	
	public static void printRefrigeratorInfo(Refrigerator refrigerator) {
	    
	    System.out.println(" Freezer capacity: " + refrigerator.getFreezerCapacity()
	                        + "; Height: " + refrigerator.getHeight()
	                        + "; Overall capacity: " + refrigerator.getOverallCapacity()
	                        + "; Power consumption: " + refrigerator.getPowerConsumption()
	                        + "; Weight: " + refrigerator.getWeight()
	                        + "; Width: " + refrigerator.getWidth());
	}
	
	public static void printSpeakersInfo(Speakers speakers) {
	    
	    System.out.println(" Cord length: " + speakers.getCordLength()
	                        + "; Frequency range: " + speakers.getFrequencyRange()
	                        + "; Number of speakers: " + speakers.getNumberOfSpeakers()
	                        + "; Power consumption: " + speakers.getPowerConsumption());
	    
	}
	
	public static void printTabletPCInfo(TabletPC tablet) {
	    
	    System.out.println(" Battery capacity: " + tablet.getBatteryCapacity()
	                        + "; Colour: " + tablet.getColour()
	                        + "; Inches: " + tablet.getDisplayInches()
	                        + "; Flash memory capacity: " + tablet.getFlashMemoryCapacity()
	                        + "; Memory ROM: " + tablet.getMemoryROM());
	}
	
	public static void printVacuumCleanerInfo(VacuumCleaner hoover) {
	    
	    System.out.println(" Bag type: " + hoover.getBagType()
	                        + "; Cleaning width: " + hoover.getCleaningWidth()
	                        + "; Filter type: " + hoover.getFilterType()
	                        + "; Motor speed regulation: " + hoover.getMotorSpeedRegulation()
	                        + "; Power consumption: " + hoover.getPowerConsumption()
	                        + "; Wand type: " + hoover.getWandType());
	}

}
