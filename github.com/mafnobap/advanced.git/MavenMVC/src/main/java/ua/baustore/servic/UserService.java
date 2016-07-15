package ua.baustore.servic;

import java.util.List;

import ua.baustore.service.entity.User;

public interface UserService {
	
	
    void save(User user);
	
	void delete(int userID);
				
	List<User> getAllUser();
	
	User findOneById(int userID);
	
	

}
