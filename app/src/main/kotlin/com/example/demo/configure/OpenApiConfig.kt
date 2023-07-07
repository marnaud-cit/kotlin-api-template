/* This Kotlin class configures an OpenAPI for a Spring application with a title of "my api". */
package com.example.demo.configure

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {
    @Bean
    fun apiConfig(): OpenAPI?{
        return OpenAPI().info(
            Info().title("my api")
        )
    }
}