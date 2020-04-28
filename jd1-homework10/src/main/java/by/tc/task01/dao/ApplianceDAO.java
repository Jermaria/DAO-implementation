package main.java.by.tc.task01.dao;

import java.util.List;

import main.java.by.tc.task01.dao.exception.DAOException;
import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
    
	List <Appliance> find(Criteria criteria) throws DAOException;
}
