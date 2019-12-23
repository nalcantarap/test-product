package cl.test.project.product.model;

import org.springframework.stereotype.Component;

import cl.test.project.entity.Product;

@Component
public class ProductMapping {

	public ProductDTO entityToDTO(Product entity) {
		ProductDTO dto=new ProductDTO();
		dto.setId(entity.getId());
		dto.setActive(entity.getActive());
		dto.setCreated(entity.getCreated());
		dto.setPrice(entity.getPrice());
		dto.setModified(entity.getModified());
		dto.setName(entity.getName());
		dto.setDescription(entity.getDescription());
		return dto;
	}
	public Product dtoToEntity(ProductDTO dto) {
		Product entity=new Product();
		entity.setId(dto.getId());
		entity.setActive(dto.getActive());
		entity.setCreated(dto.getCreated());
		entity.setPrice(dto.getPrice());
		entity.setModified(dto.getModified());
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		return entity;
	}
}
