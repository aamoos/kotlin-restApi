package com.study.kotlin.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(length = 500, nullable = false)
    val title: String,

    @Column(columnDefinition = "TEXT", nullable = false)
    val content: String,

    val author: String?= null
)