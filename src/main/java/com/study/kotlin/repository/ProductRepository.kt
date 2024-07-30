package com.study.kotlin.repository

import com.study.kotlin.entity.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository: CrudRepository<Product, Long> {
    fun findAllBy(): List<Product>
}