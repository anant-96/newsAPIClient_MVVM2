package com.example.newsapiclient_mvvmproj2.presentation.di

import com.example.newsapiclient_mvvmproj2.domain.repository.NewsRepository
import com.example.newsapiclient_mvvmproj2.domain.usecase.GetNewsHeadlinesUseCase
import com.example.newsapiclient_mvvmproj2.domain.usecase.GetSearchedNewsUseCase
import com.example.newsapiclient_mvvmproj2.domain.usecase.SaveNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Singleton
    @Provides
    fun provideGetNewsHeadlinesUseCase(
        newsRepository: NewsRepository
    ): GetNewsHeadlinesUseCase {
        return GetNewsHeadlinesUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideGetSearchedNewsUseCase(
        newsRepository: NewsRepository
    ): GetSearchedNewsUseCase {
        return GetSearchedNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideSavedNewsUseCase(
        newsRepository: NewsRepository
    ): SaveNewsUseCase {
        return SaveNewsUseCase(newsRepository)
    }
}
