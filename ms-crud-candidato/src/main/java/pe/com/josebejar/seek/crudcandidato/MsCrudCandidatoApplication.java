package pe.com.josebejar.seek.crudcandidato;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsCrudCandidatoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCrudCandidatoApplication.class, args);}


		@Bean
		public OpenAPI candidatoOpenApi(){
			return new OpenAPI()
					.info(new Info()
							.title("DOCUMENTACION CRUD CANDIDATO")
							.version("0.01")
							.description("prueba tecnica seek ")
							.termsOfService("")
							.license(new License().name("Apache 2.0 ").url("http://springdoc.org")));
	}

}
