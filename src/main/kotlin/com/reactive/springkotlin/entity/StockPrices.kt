package com.reactive.springkotlin.entity

import lombok.Data
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime
import javax.annotation.processing.Generated

@Data
@Table(name = "stockprice")
data class StockPrices(@Id val id: Long, val symbol: String, val price: Double, val updatedAt: LocalDateTime)
