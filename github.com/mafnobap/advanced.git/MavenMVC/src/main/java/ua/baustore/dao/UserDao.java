package ua.baustore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.baustore.service.entity.User;



public interface UserDao extends JpaRepository<User, Integer> {
	
	

}
