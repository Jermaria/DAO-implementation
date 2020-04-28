package main.java.by.tc.task01.service;

import java.util.List;

import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;
import main.java.by.tc.task01.service.exception.ServiceException;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria) throws ServiceException;
	
}
