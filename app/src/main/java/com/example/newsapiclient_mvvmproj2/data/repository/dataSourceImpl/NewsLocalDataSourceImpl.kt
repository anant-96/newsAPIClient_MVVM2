package com.example.newsapiclient_mvvmproj2.data.repository.dataSourceImpl

import com.example.newsapiclient_mvvmproj2.data.db.ArticleDAO
import com.example.newsapiclient_mvvmproj2.data.model.Article
import com.example.newsapiclient_mvvmproj2.data.repository.dataSource.NewsLocalDataSource

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
) : NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }
}
