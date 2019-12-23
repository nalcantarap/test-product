package cl.test.project.product.model;

import org.springframework.stereotype.Component;

import cl.test.project.exception.NegocioException;

@Component
public class ProductValidation {

	public void validationData(ProductDTO product) throws NegocioException{
		if(product==null) {
			throw new NegocioException("Error interno al crear producto");
		}
		if(product.getName()==null || product.getName().equals("")) {
			throw new NegocioException("Debe ingresar un nombre al producto");
		}
		if(product.getDescription()==null) { 
			throw new NegocioException("Debe ingresar una descripción");
		}
		if(product.getPrice()==null) {
			throw new NegocioException("Debe ingresar un precio");
		}
	}
}
