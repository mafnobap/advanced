package ua.baustore.service.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Commodity {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int commodityID;
	
	private String commodityName;
	
	private double price;
	
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private SubCategory subCategory;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Cart cart;

	public Commodity() {}
	
	

	public Commodity(String commodityName, double price) {
		
		this.commodityName = commodityName;
		this.price = price;
	}



	public Cart getCart() {
		return cart;
	}



	public void setCart(Cart cart) {
		this.cart = cart;
	}



	public int getCommodityID() {
		return commodityID;
	}

	public void setCommodityID(int commodityID) {
		this.commodityID = commodityID;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	@Override
	public String toString() {
		return "Commodity [commodityID=" + commodityID + ", commodityName=" + commodityName + ", price=" + price
				+ ", description=" + description + "]";
	}
	
	

}
