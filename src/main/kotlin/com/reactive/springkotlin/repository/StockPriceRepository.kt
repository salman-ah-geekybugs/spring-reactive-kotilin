package com.reactive.springkotlin.repository

import com.reactive.springkotlin.entity.StockPrices
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface StockPriceRepository : ReactiveCrudRepository<StockPrices,Long> {
}