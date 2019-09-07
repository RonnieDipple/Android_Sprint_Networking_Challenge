package com.example.android_sprint3_challenge

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApiInterface {

    @GET("{id}")
    fun getPokemonApiFun(@Path("id")poke:String): Call<Pokemon>
}