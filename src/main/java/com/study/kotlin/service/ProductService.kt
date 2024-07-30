package com.study.kotlin.service

import com.study.kotlin.dto.CreateProductDto
import com.study.kotlin.dto.ReadProductDto
import com.study.kotlin.repository.ProductRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class ProductService(
    private val productRepository: ProductRepository,
) {

    fun getProducts(): List<ReadProductDto> {
        val product = productRepository.findAll()
        return product.map { it.toReadProductDto() }
    }

    @Transactional
    fun createProduct(createProductDto: CreateProductDto): CreateProductDto {
        val product = productRepository.save(createProductDto.toEntity())
        return product.toCreateProductDto()
    }
}