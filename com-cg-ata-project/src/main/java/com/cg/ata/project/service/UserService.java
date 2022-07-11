package com.cg.ata.project.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ata.project.exception.UserNotFoundException;
import com.cg.ata.project.model.User;
import com.cg.ata.project.repository.UserRepository;


@Service
public class UserService{

	@Autowired
	 UserRepository UserRepository;

	@Autowired
	 UserRepository depRepository;

//	@Autowired
//	 UserService adminService;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	private UserRepository userRepository;

	public List< User> getAllUsers() {
		LOG.info("getAlluser");
		return userRepository.findAll();
	}

	public User getUserById(int eid) {
		UserRepository userRepository = null;
		@SuppressWarnings("null")
		Optional<User> userOptional = userRepository.findById(eid);
		User user = null;
		Optional<User> userOptional1 = null;
		if (userOptional1.isPresent()) {
			user = userOptional1.get();
			LOG.info(user.toString());
			return user;
		} else {
			String errorMessage = "Userwith eid " + eid + " does not exist.";
			LOG.error(errorMessage);
			throw new UserNotFoundException(errorMessage);
		}
	}

	public List<User> getAllUser1() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

//	public User addUser(User user) {
//		LOG.info(user.toString());
//		if (user.getUser() != null)
//			depService.getDepartmentById(employee.getDepartment().getDid());
//		return empRepository.save();
	}
}

