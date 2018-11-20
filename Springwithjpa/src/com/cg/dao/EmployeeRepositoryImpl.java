package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@PersistenceContext //going to takecare of emf
	private EntityManager entityManager;

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.persist(employee); //reflect changes in database
		entityManager.flush();
		return employee;
	}

	@Override
	public List<Employee> loadAll() {
		// TODO Auto-generated method stub
		TypedQuery<Employee> typedQuery=entityManager.createQuery("select e from Employee e", Employee.class);
		return typedQuery.getResultList();
		
		
	}

}
