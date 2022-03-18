package com.example.karting.domain.model

interface CustomerRepository {
    fun save(customer: Customer)
}
