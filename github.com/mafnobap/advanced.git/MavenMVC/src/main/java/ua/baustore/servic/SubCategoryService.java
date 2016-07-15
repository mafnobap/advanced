package ua.baustore.servic;

import java.util.List;

import ua.baustore.service.entity.SubCategory;

public interface SubCategoryService {
	
	void save(SubCategory subCategory);
	
	void delete(int Id);
		
	List<SubCategory> getAllSubCategory();
	
	SubCategory findOneById(int id);
	


}
