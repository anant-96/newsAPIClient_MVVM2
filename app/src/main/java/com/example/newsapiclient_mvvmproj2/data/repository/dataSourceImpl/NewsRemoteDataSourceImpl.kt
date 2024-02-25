package com.example.newsapiclient_mvvmproj2.data.repository.dataSourceImpl

import com.example.newsapiclient_mvvmproj2.data.api.NewsAPIServices
import com.example.newsapiclient_mvvmproj2.data.model.APIResponse
import com.example.newsapiclient_mvvmproj2.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIResponse: NewsAPIServices,
    private val country: String,
    private val page:Int
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsAPIResponse.getTopHeadlines(country, page)
    }
}
