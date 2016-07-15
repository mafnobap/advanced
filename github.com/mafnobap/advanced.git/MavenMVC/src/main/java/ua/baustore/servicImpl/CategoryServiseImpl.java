package ua.baustore.servicImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.baustore.dao.CategoryDao;
import ua.baustore.servic.CategoryService;
import ua.baustore.service.entity.Category;

@Service("categoryService")
public class CategoryServiseImpl implements CategoryService {
	
	@Autowired 
	private CategoryDao categoryDao;

	public void save(Category category) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Category findOneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	

}
