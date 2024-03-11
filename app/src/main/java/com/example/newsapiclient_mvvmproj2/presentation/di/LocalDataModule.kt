package com.example.newsapiclient_mvvmproj2.presentation.di

import com.example.newsapiclient_mvvmproj2.data.db.ArticleDAO
import com.example.newsapiclient_mvvmproj2.data.repository.dataSource.NewsLocalDataSource
import com.example.newsapiclient_mvvmproj2.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun providesLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource {
        return NewsLocalDataSourceImpl(articleDAO)
    }
}
