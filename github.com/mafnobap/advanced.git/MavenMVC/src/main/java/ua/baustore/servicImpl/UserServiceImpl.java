package ua.baustore.servicImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Service;

import ua.baustore.dao.UserDao;
import ua.baustore.servic.UserService;
import ua.baustore.service.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public void save(User user) {
		userDao.save(user);
		
	}

	public void delete(int userID) {
		userDao.delete(userID);
		
	}

	public List<User> getAllUser() {
		
		return userDao.findAll();
	}

	public User findOneById(int userID) {
	
		return userDao.findOne(userID);
	}







	

}
