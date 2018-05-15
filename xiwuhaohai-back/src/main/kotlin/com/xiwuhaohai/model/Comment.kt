package com.xiwuhaohai.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Comment(@Id var id: Long? = -1,
                   var user: User,
                   var text: String = "",
                   var images: List<String> = Collections.emptyList(),
                   var rate: Int,
                   var good: Good,
                   var createTime: Long)