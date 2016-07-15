package ua.baustore.servic;

import java.util.List;

import ua.baustore.service.entity.Cart;


public interface CartService {
	
    void save(Cart cart);
    
    void delete (int cartID);
    	
    List<Cart> getAllCart();
	
	Cart findOneById(int cartID);

}
