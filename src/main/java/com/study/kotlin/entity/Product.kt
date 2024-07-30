package com.study.kotlin.entity

import com.study.kotlin.dto.CreateProductDto
import com.study.kotlin.dto.ReadProductDto
import jakarta.persistence.*
import java.time.OffsetDateTime

enum class Category {
    Phone, Laptop, Keyboard
}

@Entity
data class Product(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,

    @Enumerated(EnumType.STRING)
    val category: Category,

    val createDateTime: OffsetDateTime = OffsetDateTime.now(),
    val updateDateTime: OffsetDateTime?= null
) {
    fun toReadProductDto(): ReadProductDto {
        return ReadProductDto(
            id = id,
            name = name,
            category = category
        )
    }

    fun toCreateProductDto(): CreateProductDto {
        return CreateProductDto(
            name = name,
            category = category
        )
    }
}