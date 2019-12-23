package cl.test.project.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.test.project.exception.NegocioException;
import cl.test.project.product.model.ProductDTO;
import cl.test.project.product.service.ProductServiceInterface;

@Controller()
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductServiceInterface productServiceInterface;
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody ProductDTO create(@RequestBody ProductDTO request) throws NegocioException {
		return productServiceInterface.create(request);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseBody ProductDTO update(@PathVariable Integer id,@RequestBody ProductDTO request) throws NegocioException {
		return productServiceInterface.update( id,request);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	@ResponseBody List<ProductDTO> getAll()throws NegocioException {
		return productServiceInterface.getAll();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody ProductDTO getById(@PathVariable Integer id)throws NegocioException {
		return productServiceInterface.getById(id);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody Boolean delete(@PathVariable Integer id) throws NegocioException{
		return productServiceInterface.delete(id);
	}
}
