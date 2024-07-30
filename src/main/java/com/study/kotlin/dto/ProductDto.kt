package com.study.kotlin.dto

import com.study.kotlin.entity.Category
import com.study.kotlin.entity.Product

//read
data class ReadProductDto(
    val id: Long? = null,
    val name: String,
    val category: Category
)

//create
data class CreateProductDto(
    val name: String,
    val category: Category
){
    fun toEntity(): Product {
        return Product(
            name = name,
            category = category,
        )
    }
}