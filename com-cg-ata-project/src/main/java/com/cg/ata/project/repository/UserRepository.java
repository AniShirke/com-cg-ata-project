package com.cg.ata.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ata.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {



	//public abstract List<User> findById(int eid);

//	public abstract List<User> findByFirstNameIgnoreCase(String firstName);
//
//	public abstract List<User> findBySalary(double salary);
//
//	public abstract List<User> findBySalaryGreaterThan(double salary);
//
//	public abstract List<User> findBySalaryLessThan(double salary);
}