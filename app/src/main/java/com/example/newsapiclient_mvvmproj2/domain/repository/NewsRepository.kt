package com.example.newsapiclient_mvvmproj2.domain.repository

import com.example.newsapiclient_mvvmproj2.data.model.APIResponse
import com.example.newsapiclient_mvvmproj2.data.model.Article
import com.example.newsapiclient_mvvmproj2.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>

}
