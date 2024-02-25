package com.example.newsapiclient_mvvmproj2.data.repository.dataSource

import com.example.newsapiclient_mvvmproj2.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(): Response<APIResponse>
}
