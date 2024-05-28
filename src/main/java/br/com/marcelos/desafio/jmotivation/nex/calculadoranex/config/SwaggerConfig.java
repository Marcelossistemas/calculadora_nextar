package br.com.marcelos.desafio.jmotivation.nex.calculadoranex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                .title("API Calculadora Matemática por Expressões")
                .version("1.0")
                .description("API documentação teste NEXT....."));
    }
}
