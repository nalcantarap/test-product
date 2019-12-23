package cl.test.project.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="product_id")
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
	public Product() {}
	public Product(Integer id, String name, String description, Integer price, LocalDateTime created,
			LocalDateTime modified, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.created = created;
		this.modified = modified;
		this.active = active;
	}
	public Product(String name, String description, Integer price, LocalDateTime created,
			LocalDateTime modified, Boolean active) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.created = created;
		this.modified = modified;
		this.active = active;
	}
}
