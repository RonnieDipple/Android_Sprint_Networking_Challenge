package com.example.android_sprint3_challenge

import retrofit2.Call
import retrofit2.http.GET

interface PokemonApiInterface {

    @GET("v2/")
    fun getPokemonApiFun(): Call<Pokemon>
}