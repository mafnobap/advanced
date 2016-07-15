package ua.baustore.servicImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.baustore.dao.CartDao;
import ua.baustore.servic.CartService;
import ua.baustore.service.entity.Cart;

@Service("cartService")
public class CartServiceImpl implements CartService {
	
	
	@Autowired
	private CartDao cartDao;

	public void save(Cart cart) {
		cartDao.save(cart);
		
	}

	public void delete(int cartID) {
		cartDao.delete(cartID);
		
	}


	public List<Cart> getAllCart() {
		
		return cartDao.findAll();
	}

	public Cart findOneById(int cartID) {
		
		return cartDao.findOne(cartID);
	}
	



	

}
