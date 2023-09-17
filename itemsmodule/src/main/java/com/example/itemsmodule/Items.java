package com.example.itemsmodule;
import java.time.LocalDate;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;
@Entity
public class Items
{
	private long id;
	private String name ; 
	private LocalDate manufacturing;
	private LocalDate expiry;
	private float price;
	private String category;
	
	public Items() {
		super();
	}
	public Items(long id, String name, LocalDate manufacturing, LocalDate expiry, float price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturing = manufacturing;
		this.expiry = expiry;
		this.price = price;
		this.category = category;
	}
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry
				+ ", price=" + price + ", category=" + category + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getManufacturing()=" + getManufacturing() + ", getExpiry()=" + getExpiry() + ", getPrice()="
				+ getPrice() + ", getCategory()=" + getCategory() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
