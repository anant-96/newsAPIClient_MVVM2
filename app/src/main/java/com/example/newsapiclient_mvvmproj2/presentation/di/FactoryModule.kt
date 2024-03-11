package com.example.newsapiclient_mvvmproj2.presentation.di

import android.app.Application
import com.example.newsapiclient_mvvmproj2.domain.usecase.GetNewsHeadlinesUseCase
import com.example.newsapiclient_mvvmproj2.domain.usecase.GetSavedNewsUseCase
import com.example.newsapiclient_mvvmproj2.domain.usecase.GetSearchedNewsUseCase
import com.example.newsapiclient_mvvmproj2.domain.usecase.SaveNewsUseCase
import com.example.newsapiclient_mvvmproj2.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun providesNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase,
        saveNewsUseCase: SaveNewsUseCase,
        getSavedNewsUseCase: GetSavedNewsUseCase,
    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            application,
            getNewsHeadlinesUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase
        )
    }
}
