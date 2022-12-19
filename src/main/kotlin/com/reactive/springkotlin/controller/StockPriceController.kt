package com.reactive.springkotlin.controller

import com.reactive.springkotlin.entity.StockPrices
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

import java.time.Duration
import java.time.LocalDateTime
import java.util.concurrent.ThreadLocalRandom

@RestController
class StockPriceController {
    @GetMapping(value = ["/stockPrices/{symbol}"], produces = [MediaType.APPLICATION_STREAM_JSON_VALUE])
    fun prices(@PathVariable symbol: String): Flux<StockPrices> {
        println("symbol $symbol")
        return Flux.interval(Duration.ofSeconds(1)).map {
            StockPrices(0,"data", getRandomStockPrice(), LocalDateTime.now())
        }
    }

    fun getRandomStockPrice(): Double {
        return ThreadLocalRandom.current().nextDouble(100.0)
    }

    @GetMapping(value = ["/stockPrice"])
    fun getSingleStockPrice(): Mono<StockPrices> {
        return Mono.just(StockPrices(1,"dis stock", getRandomStockPrice(), LocalDateTime.now()))
    }
}