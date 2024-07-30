package com.ansdev.book.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;

@OpenAPIDefinition(
        info = @Info(
              contact = @Contact(
                      name = "ansdev",
                      email = "anar.soltann@gmail.com"
        ),
                description = "Open API for Book Network",
                title = "Book Network API-ANSDEV",
                version = "1.0.0",
                license = @License(
                        name = "Licence 1.0",
                        url = "ansdev.com"
                ),
                termsOfService = "Terms of Service"
        ),
        servers = {
                @Server(
                        description = "Local Environment",
                        url = "http://localhost:8080/api/v1",
                        variables = {
                                @ServerVariable(name = "version", defaultValue = "v1", description = "API Version")
                        }
                ),
                @Server(
                        description = "Production Environment",
                        url = "https://book-network-api.ansdev.com"
                )
        },
                security = {
                        @SecurityRequirement(
                                name = "bearerAuth"
                        )
        }
)
@SecurityScheme(
        name="bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
