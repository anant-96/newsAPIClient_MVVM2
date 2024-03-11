package com.example.newsapiclient_mvvmproj2.data.repository.dataSource

import com.example.newsapiclient_mvvmproj2.data.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)
    fun getSavedArticles() : Flow<List<Article>>
    suspend fun deleteArticlesFromDB(article: Article)
}
