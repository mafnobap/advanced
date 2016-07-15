package ua.baustore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.baustore.service.entity.Category;



public interface CategoryDao extends JpaRepository<Category, Integer> {
	 


}
