package cl.test.project.product.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.test.project.entity.Product;
import cl.test.project.exception.NegocioException;
import cl.test.project.product.model.ProductDTO;
import cl.test.project.product.model.ProductMapping;
import cl.test.project.product.model.ProductValidation;
import cl.test.project.repository.ProductRepository;

@Service
public class ProductService implements ProductServiceInterface{
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductMapping mapping;
	@Autowired
	ProductValidation validation;
	public ProductDTO create(ProductDTO request) throws NegocioException{
		validation.validationData(request);
		try {
			request.setId(null);
			request.setCreated(LocalDateTime.now());
			request.setModified(LocalDateTime.now());
			request.setActive(true);
			Product product=productRepository.save(mapping.dtoToEntity(request));
			return mapping.entityToDTO(product);
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new NegocioException("Error interno al crear producto");
		}

	}
	@Override
	public ProductDTO update(Integer id,ProductDTO request) throws NegocioException{
		Product productOld=this.getProduct(id);
		validation.validationData(request);
		try {
			request.setId(id);
			request.setCreated(productOld.getCreated());
			request.setModified(LocalDateTime.now());
			request.setActive(request.getActive()==null?productOld.getActive():request.getActive());
			Product product=productRepository.save(mapping.dtoToEntity(request));
			return mapping.entityToDTO(product);
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new NegocioException("Error interno al modificar producto");
		}
	}
	@Override
	public List<ProductDTO> getAll() throws NegocioException {
		try {
			List<ProductDTO> response=new ArrayList<ProductDTO>();
			Iterable<Product> products=productRepository.findAll();
			products.forEach(p->{
				response.add(mapping.entityToDTO(p));
			});
			return response;
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new NegocioException("Error interno al consultar producto");
		}
	}
	@Override
	public ProductDTO getById(Integer id) throws NegocioException{
		Product product=this.getProduct(id);
		try {
		
			return mapping.entityToDTO(product);
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new NegocioException("Error interno buscar producto");
		}
	}
	@Override
	public Boolean delete(Integer id)throws NegocioException {
		Product product=this.getProduct(id);
		try {
			productRepository.delete(product);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new NegocioException("Error interno al eliminar producto");
		}
	}
	private Product getProduct(Integer id)throws NegocioException {
		if(id==null) {
			throw new NegocioException("Id no ingresado");
		}
		Optional<Product> product=productRepository.findById(id);
		if(!product.isPresent()) {
			throw new NegocioException("Id no existe");
		}
		return product.get();
	}

	
}
