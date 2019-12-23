package cl.test.project;


import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig 
{                                    
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .paths(PathSelectors.any())            
          .apis( RequestHandlerSelectors.basePackage("cl.test.project.product"))
          .build().pathMapping("/")
          .apiInfo(apiInfo());
    }
    
    @SuppressWarnings("deprecation")
	private ApiInfo apiInfo() 
    {
        return new ApiInfo("Api Test", "Test", "1.0", "termsOfServiceUrl", "contactName", "license", "licenseUrl");
   }
}