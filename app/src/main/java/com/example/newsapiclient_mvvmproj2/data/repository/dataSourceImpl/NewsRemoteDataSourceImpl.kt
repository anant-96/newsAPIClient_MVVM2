package com.example.newsapiclient_mvvmproj2.data.repository.dataSourceImpl

import com.example.newsapiclient_mvvmproj2.data.api.NewsAPIServices
import com.example.newsapiclient_mvvmproj2.data.model.APIResponse
import com.example.newsapiclient_mvvmproj2.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIResponse: NewsAPIServices
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse> {
        return newsAPIResponse.getTopHeadlines(country, page)
    }

    override suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Response<APIResponse> {
        return newsAPIResponse.getSearchedTopHeadlines(country, searchQuery, page)
    }
}
