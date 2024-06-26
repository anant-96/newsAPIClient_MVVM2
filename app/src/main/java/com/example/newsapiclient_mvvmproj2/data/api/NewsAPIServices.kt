package com.example.newsapiclient_mvvmproj2.data.api

import com.example.newsapiclient_mvvmproj2.BuildConfig
import com.example.newsapiclient_mvvmproj2.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIServices {

    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country : String,
        @Query("page")
        page:Int,
        @Query("apiKey")
        apiKey:String = BuildConfig.API_KEY
    ): Response<APIResponse>

    @GET("v2/top-headlines")
    suspend fun getSearchedTopHeadlines(
        @Query("country")
        country : String,
        @Query("q")
        searchQuery:String,
        @Query("page")
        page:Int,
        @Query("apiKey")
        apiKey:String = BuildConfig.API_KEY
    ): Response<APIResponse>
}
