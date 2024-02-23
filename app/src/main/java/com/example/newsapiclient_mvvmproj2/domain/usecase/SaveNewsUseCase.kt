package com.example.newsapiclient_mvvmproj2.domain.usecase

import com.example.newsapiclient_mvvmproj2.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
}
