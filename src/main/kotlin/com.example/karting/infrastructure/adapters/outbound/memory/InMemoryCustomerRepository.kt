package com.example.karting.infrastructure.adapters.outbound.memory

import com.example.karting.domain.model.Customer
import com.example.karting.domain.model.CustomerRepository

class InMemoryCustomerRepository : CustomerRepository {

    private val customers = mutableListOf<Customer>()

    override fun save(customer: Customer) {
        customers.add(customer)
    }
}
