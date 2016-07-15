package ua.baustore.service.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class SubCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nameSubCategory;
	
	@ManyToOne(fetch=FetchType.LAZY)	
	private Category category;
	
	@OneToMany(fetch= FetchType.LAZY, mappedBy="subCategory")	
     private List<Commodity> commodites;
	
	
	
	public SubCategory() {}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameSubCategory() {
		return nameSubCategory;
	}
	public void setNameSubCategory(String nameSubCategory) {
		this.nameSubCategory = nameSubCategory;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Commodity> getCommodites() {
		return commodites;
	}
	public void setCommodites(List<Commodity> commodites) {
		this.commodites = commodites;
	}
	@Override
	public String toString() {
		return "SubCategory [id=" + id + ", nameSubCategory=" + nameSubCategory
				+ ", category=" + category + "]";
	}

}
