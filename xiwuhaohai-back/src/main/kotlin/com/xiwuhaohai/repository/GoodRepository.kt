package com.xiwuhaohai.repository

import com.xiwuhaohai.model.Good
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GoodRepository : MongoRepository<Good, Long> {

}