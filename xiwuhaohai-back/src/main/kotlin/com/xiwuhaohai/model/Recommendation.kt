package com.xiwuhaohai.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Recommendation(@Id var id: Long? = -1,
                          var good: Good)