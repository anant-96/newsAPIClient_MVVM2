package com.example.newsapiclient_mvvmproj2.data.repository.dataSource

import com.example.newsapiclient_mvvmproj2.data.model.Article

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)
}