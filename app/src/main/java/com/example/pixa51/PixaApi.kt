package com.example.pixa51

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {
    @GET("api/")
    fun getImage(
        @Query("q") keyWord: String,
        @Query("per_page") per_page :Int=5,
        @Query("page") page :Int,
        @Query("key") key: String = "33148109-2b7ff4ca3aa7aaa34fc775eea"
    ):Call<PixaModel>
}