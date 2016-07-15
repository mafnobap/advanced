package ua.baustore.service.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cartID;
	
	@OneToMany(fetch= FetchType.LAZY, mappedBy="cart")
	private List<Commodity> commodites;
	@OneToOne(fetch=FetchType.LAZY, mappedBy="cart")
	private User user;
	
	public Cart() {}

	public User getUser() {
		return user;
	}

	public void setUser (User user) {
		this.user = user;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public int getCartID() {
		return cartID;
	}

	public void setOrderID(int cartID) {
		this.cartID = cartID;
	}

	public List<Commodity> getCommodites() {
		return commodites;
	}

	public void setCommodites(List<Commodity> commodites) {
		this.commodites = commodites;
	}
	
	
	
	

}
