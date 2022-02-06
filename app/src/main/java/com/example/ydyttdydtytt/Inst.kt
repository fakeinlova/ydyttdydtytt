package com.example.ydyttdydtytt

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Inst {
    const val BASE_URL = "https://api.thecatapi.com/v1/"

    val retrofit by lazy {
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

    }

    val api : RetrofitInterface by lazy {
        retrofit.create(RetrofitInterface::class.java)
    }
}