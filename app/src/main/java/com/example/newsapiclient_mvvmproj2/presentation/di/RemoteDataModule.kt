package com.example.newsapiclient_mvvmproj2.presentation.di

import com.example.newsapiclient_mvvmproj2.data.api.NewsAPIServices
import com.example.newsapiclient_mvvmproj2.data.repository.dataSource.NewsRemoteDataSource
import com.example.newsapiclient_mvvmproj2.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {
    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsAPIServices: NewsAPIServices
    ): NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(newsAPIServices)
    }
}
