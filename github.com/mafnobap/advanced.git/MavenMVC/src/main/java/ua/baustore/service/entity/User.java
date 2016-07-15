package ua.baustore.service.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int userID;
	
	private String firstName;
	
	private String lastName;
	
	private String userPassword;
	
	private String userEmail;
	
	private String numberFhone;
	
	@OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Cart cart;
	
	public User() {	}

	public User(String firstName, String lastName, String userPassword, String userEmail, String numberFhone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.numberFhone = numberFhone;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getNumberFhone() {
		return numberFhone;
	}

	public void setNumberFhone(String numberFhone) {
		this.numberFhone = numberFhone;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	



	
}
