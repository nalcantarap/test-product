package cl.test.project.testproduct;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cl.test.project.exception.NegocioException;
import cl.test.project.product.model.ProductDTO;
import cl.test.project.product.service.ProductServiceInterface;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProductApplicationTests {
	@Autowired
	ProductServiceInterface productService;
	@Test
	public void contextLoads() {
	}
	@Test
	public void createTest() throws NegocioException {
		ProductDTO request=new ProductDTO();
		request.setActive(true);
		request.setCreated(LocalDateTime.now());
		request.setDescription("Producto prueba");
		request.setModified(LocalDateTime.now());
		request.setName("Producto 1");
		request.setPrice(4000);
		ProductDTO product=productService.create(request);
		assertTrue(product!=null);
	}
}
