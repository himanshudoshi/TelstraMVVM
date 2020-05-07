package com.telstra.telstramvvm.data.model

import com.google.gson.annotations.SerializedName

data class FactsItem(
    @SerializedName("imageHref")
    val imageHref: String? = "",
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("title")
    val title: String? = ""
)