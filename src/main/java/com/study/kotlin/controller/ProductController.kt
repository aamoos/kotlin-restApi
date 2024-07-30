package com.study.kotlin.controller

import com.study.kotlin.dto.CreateProductDto
import com.study.kotlin.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(
    private val productService: ProductService
) {

    @GetMapping("/product", produces = ["application/json"])
    fun getProducts(): ResponseEntity<Any> {
        return ResponseEntity
            .ok()
            .body(productService.getProducts())
    }

    @PostMapping("/product")
    fun createProduct(@RequestBody createProductDto: CreateProductDto): ResponseEntity<Any> {
        productService.createProduct(createProductDto)
        return ResponseEntity
            .ok()
            .body(true)
    }


}