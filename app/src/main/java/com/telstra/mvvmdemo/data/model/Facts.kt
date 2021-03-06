package com.telstra.mvvmdemo.data.model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

/**
 * data class for Facts
 * Entity Class for Room Database
 */
const val PRIMARY_KEY = 0

@Entity
data class Facts(
    @SerializedName("title")
    val title: String = "",
    @SerializedName("rows")
    val rows: List<FactsItem>?
) {
    @PrimaryKey(autoGenerate = true)
    var id = PRIMARY_KEY

    companion object {
        @Ignore
        val messageOptionListType: Type = object : TypeToken<List<FactsItem>>() {}.type
    }
}
