package cl.test.project.product.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ProductDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1637202535579131935L;
	private Integer id;
	private String name;
	private String description;
	private Integer price;
	private LocalDateTime created;
	private LocalDateTime modified;
	private Boolean active;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public LocalDateTime getModified() {
		return modified;
	}
	public void setModified(LocalDateTime modified) {
		this.modified = modified;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
