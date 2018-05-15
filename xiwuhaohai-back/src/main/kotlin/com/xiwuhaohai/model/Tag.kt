package com.xiwuhaohai.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Tag(@Id var id: Long? = -1,
               var image: String = "",
               var text: String = "")