package main.java.by.tc.task01.service.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.by.tc.task01.dao.ApplianceDAO;
import main.java.by.tc.task01.dao.DAOFactory;
import main.java.by.tc.task01.dao.exception.DAOException;
import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;
import main.java.by.tc.task01.service.ApplianceService;
import main.java.by.tc.task01.service.exception.ServiceException;
import main.java.by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List <Appliance> find(Criteria criteria) throws ServiceException {
	    
	    List<Appliance> appliances= new ArrayList <Appliance>();
	    
		if (!Validator.criteriaValidator(criteria)) {
			appliances = null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		try {
		    
		    appliances = applianceDAO.find(criteria);
		
		} catch (DAOException e) {
		    
		    throw new ServiceException(e.getMessage(), e);
		}
				
		return appliances;
	}

}

//you may add your own new classes
