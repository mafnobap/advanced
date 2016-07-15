package ua.baustore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.baustore.service.entity.Cart;

public interface CartDao extends JpaRepository<Cart, Integer> {
	

		
		
}
