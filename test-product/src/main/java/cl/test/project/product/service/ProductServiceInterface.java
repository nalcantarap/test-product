package cl.test.project.product.service;

import java.util.List;

import cl.test.project.exception.NegocioException;
import cl.test.project.product.model.ProductDTO;

public interface ProductServiceInterface {

	ProductDTO create(ProductDTO request) throws NegocioException;

	ProductDTO update(Integer id,ProductDTO request) throws NegocioException;

	List<ProductDTO> getAll() throws NegocioException;

	ProductDTO getById(Integer id) throws NegocioException;

	Boolean delete(Integer id)throws NegocioException;


}
