package com.example.tp06_android.dal.online.services

import com.example.tp06_android.dal.online.models.ArticleResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitApiService {
    @GET("everything/")
    fun getArticles(@Query("q") query: String): Call<ArticleResponse>
}
