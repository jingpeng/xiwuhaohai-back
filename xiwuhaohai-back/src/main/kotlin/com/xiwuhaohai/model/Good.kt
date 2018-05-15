package com.xiwuhaohai.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Good(@Id var id: Long? = -1,
                var coverImage: String = "",
                var bannerImages: List<String> = Collections.emptyList(),
                var title: String = "",
                var summary: String = "",
                var specifications: String = "",
                var originalPrice: Int? = 0,
                var actualPrice: Int? = 0,
                var buyerRecommendation: String = "",
                var featuredTag: List<Tag> = Collections.emptyList(),
                var details: List<String> = Collections.emptyList(),
                var recommendations: List<Recommendation> = Collections.emptyList(),
                var originalPrice: Int? = 0)