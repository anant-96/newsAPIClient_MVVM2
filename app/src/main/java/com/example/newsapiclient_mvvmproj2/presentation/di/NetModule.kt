package com.example.newsapiclient_mvvmproj2.presentation.di

import com.example.newsapiclient_mvvmproj2.BuildConfig
import com.example.newsapiclient_mvvmproj2.data.api.NewsAPIServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BuildConfig.BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun provideAPIResponse(retrofit: Retrofit): NewsAPIServices {
        return retrofit.create(NewsAPIServices::class.java)
    }
}
