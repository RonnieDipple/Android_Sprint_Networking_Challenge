package com.example.android_sprint3_challenge

import com.google.gson.annotations.SerializedName

data class Pokemon(
    @SerializedName("name")
    val name: String,
    val url: String,
    val id: Int,
    @SerializedName("ability")
    val ability: String,
    @SerializedName("type")
    val type: String)