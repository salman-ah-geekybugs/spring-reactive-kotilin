package com.reactive.springkotlin.service

import com.reactive.springkotlin.repository.StockPriceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StockPriceService {
    @Autowired
    private lateinit var stockPriceRepository : StockPriceRepository

    
}