package com.example.pixa51

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitService {
    var retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/").addConverterFactory(
        GsonConverterFactory.create(Gson())).build()
    val api = retrofit.create(PixaApi::class.java)
}