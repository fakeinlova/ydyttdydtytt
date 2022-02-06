package com.example.ydyttdydtytt


import retrofit2.Call
import retrofit2.http.GET


interface RetrofitInterface {
    @GET("images/search")
    fun getR() : Call<Modell>
}