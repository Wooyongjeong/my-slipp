package net.slipp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig{
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("net.slipp"))
				.paths(PathSelectors.ant("/api/**")) // /v1/api/** 인 URL들만 필터링
				.build()
				.apiInfo(apiInfo())
				.enable(true);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("My Slipp API")
				.description("My Slipp API")
				.version("1.0")
				.build();
	}
}
