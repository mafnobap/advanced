package ua.baustore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.baustore.service.entity.SubCategory;

public interface SubCategoryDao extends JpaRepository<SubCategory, Integer> {
	


}
