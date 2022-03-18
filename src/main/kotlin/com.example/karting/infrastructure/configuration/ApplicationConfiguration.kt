package com.example.karting.infrastructure.configuration

import com.example.karting.application.service.SignUpCustomerService
import com.example.karting.domain.model.CustomerRepository
import com.example.karting.infrastructure.adapters.outbound.postgres.PostgresCustomerRepository
import java.time.Clock
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate

@Configuration
class ApplicationConfiguration {

    @Bean
    fun customerRepository(jdbcTemplate: JdbcTemplate) = PostgresCustomerRepository(jdbcTemplate, Clock.systemUTC())

    @Bean
    fun signUpCustomerService(repository: CustomerRepository) = SignUpCustomerService(repository)
}
