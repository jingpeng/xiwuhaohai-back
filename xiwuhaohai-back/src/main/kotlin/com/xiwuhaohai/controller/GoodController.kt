package com.xiwuhaohai.controller

import com.xiwuhaohai.model.Good
import com.xiwuhaohai.repository.GoodRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GoodController {
    @Autowired
    lateinit var goodRepository: GoodRepository

    @GetMapping("/good")
    fun create() {
        goodRepository.save(Good(1L))
    }
}