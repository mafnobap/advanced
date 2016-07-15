package ua.baustore.servic;

import java.util.List;

import ua.baustore.service.entity.Category;

public interface CategoryService {
	
	void save(Category category);
	
	void delete(int id);
	
	List<Category> getAllCategory();
	
	Category findOneById(int id);
	


}
