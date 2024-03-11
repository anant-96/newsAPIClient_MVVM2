package com.example.newsapiclient_mvvmproj2.data.repository.dataSourceImpl

import com.example.newsapiclient_mvvmproj2.data.db.ArticleDAO
import com.example.newsapiclient_mvvmproj2.data.model.Article
import com.example.newsapiclient_mvvmproj2.data.repository.dataSource.NewsLocalDataSource
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
) : NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }

    override fun getSavedArticles(): Flow<List<Article>> {
        return articleDAO.getAllArticles()
    }
}
