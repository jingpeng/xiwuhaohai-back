package com.xiwuhaohai.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Good(@Id var id: Long? = -1)