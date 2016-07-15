package ua.baustore.servicImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.baustore.dao.SubCategoryDao;
import ua.baustore.servic.SubCategoryService;
import ua.baustore.service.entity.SubCategory;
@Service("subCategoryService")
public class SubCategoryServiseImpl implements SubCategoryService {
	
	
	@Autowired 
	private SubCategoryDao subCategoryDao;

	public void save(SubCategory subCategory) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int Id) {
		// TODO Auto-generated method stub
		
	}

	public List<SubCategory> getAllSubCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public SubCategory findOneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}







}
