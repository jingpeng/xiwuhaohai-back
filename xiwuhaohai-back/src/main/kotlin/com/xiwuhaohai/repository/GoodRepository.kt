package com.xiwuhaohai.repository

import com.xiwuhaohai.model.Good
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "good", path = "good")
interface GoodRepository : MongoRepository<Good, Long> {

}