package com.example.newsapiclient_mvvmproj2.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.newsapiclient_mvvmproj2.data.model.Article
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticleDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: Article)

    @Query("SELECT * FROM articles")
    fun getAllArticles() : Flow<List<Article>>

    @Delete
    suspend fun deleteArticle(article:Article)
}
