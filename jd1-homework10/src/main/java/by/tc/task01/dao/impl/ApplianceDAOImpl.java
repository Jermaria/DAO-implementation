package main.java.by.tc.task01.dao.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import main.java.by.tc.task01.dao.ApplianceDAO;
import main.java.by.tc.task01.dao.exception.DAOException;
import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public List <Appliance> find(Criteria criteria) throws DAOException {
		
	    List <Appliance> matchingAppliances = new ArrayList<Appliance>();
	    
	    ApplianceReader reader = new ApplianceReader (criteria);
	    
	    List<String> matchingAppliancesInfo = new ArrayList<String>();
	    
	    try {
	        
	        matchingAppliancesInfo = reader.find();
	    
	    } catch (FileNotFoundException e) {
	        
	        throw new DAOException("File with aplliances wasn't found", e);
	        
	    } catch (IOException e) {
            
	        throw new DAOException("Reader failed to close", e);
        }
	    
	    ApplianceCreator creator = new ApplianceCreator();
	    matchingAppliances = creator.create(matchingAppliancesInfo);
	
	
	    return matchingAppliances;
	}
	

}


